package com.txy.dao.takeout;

import com.txy.pojo.Takeout;

public interface TakeoutDao {

    //添加出库记录
    public int add(Takeout takeout)throws  Exception;
}
