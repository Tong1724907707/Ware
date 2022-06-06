package com.txy.service.product;

import com.txy.pojo.Product;

import java.util.List;

public interface ProductService {
    //查询所有商品
    public List<Product> getProductList()throws Exception;
    //修改指定商品的库存
    public  boolean updateById(Integer id, Integer quantity)throws Exception;
    //根据商品id查询库存
    public int selectById( Integer id)throws  Exception;
}
