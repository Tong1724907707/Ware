package com.txy.dao.product;

import com.txy.pojo.Product;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProductDao {
    //查询所有商品
    public List<Product> getProductList()throws Exception;
    //修改指定商品的库存
    public  int updateById(@Param("id")Integer id,@Param("quantity") Integer quantity)throws Exception;
    //根据商品id查询库存
    public int selectById(@Param("id") Integer id)throws  Exception;
}
