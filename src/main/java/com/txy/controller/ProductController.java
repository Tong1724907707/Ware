package com.txy.controller;

import com.txy.pojo.Product;
import com.txy.pojo.Takeout;
import com.txy.service.product.ProductService;
import com.txy.service.takeout.TakeoutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class ProductController{

    @Resource
    private TakeoutService takeoutService;
    @Resource
    private ProductService productService;

    //查询所有商品txy
    @RequestMapping()
    public String select(Model model){
        List<Product> productList=null;
        try {
            productList=productService.getProductList();
            model.addAttribute("productList",productList);
        }catch (Exception e){
            e.printStackTrace();
        }
        return "";
    }

    //查询指定商品的库存
    @RequestMapping()
    public String selectById(@PathVariable Integer id, Model model)throws Exception{
        int product=productService.selectById(id);
        model.addAttribute(product);
        return "";
    }

    //添加出库记录
    @RequestMapping()
    public String add(Takeout takeout)throws Exception{
        if (takeoutService.add(takeout)) {
            return "";
        } else {
            return "";
        }
    }

    //修改指定商品的库存
    @RequestMapping()
    public String update(Integer id,int quantity)throws Exception{
        if (productService.updateById(id,quantity)) {
            return "";
        } else {
            return "";
        }
    }
}
