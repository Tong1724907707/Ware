package com.txy.service.product;

import com.txy.dao.product.ProductDao;
import com.txy.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductDao productDao;

    //查询所有商品
    @Override
    public List<Product> getProductList() throws Exception{
       return productDao.getProductList();
    }
    //修改指定商品的库存
    @Override
    public  boolean updateById(Integer id,Integer quantity) throws Exception{
      boolean falg=true;
      if(productDao.updateById(id,quantity)<1){
          falg=false;
      }
      return falg;
    }
    //根据商品id查询库存
    @Override
    public int selectById( Integer id) throws Exception{
      return productDao.selectById(id);
    }
}
