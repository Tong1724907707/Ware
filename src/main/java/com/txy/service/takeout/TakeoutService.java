package com.txy.service.takeout;

import com.txy.pojo.Takeout;

public interface TakeoutService {
    //添加出库记录
    public boolean add(Takeout takeout)throws  Exception;
}
