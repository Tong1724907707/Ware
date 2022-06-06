package com.txy.service.takeout;

import com.txy.dao.takeout.TakeoutDao;
import com.txy.pojo.Takeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TakeoutServiceImpl implements TakeoutService {

    @Autowired
    private TakeoutDao takeoutDao;

    //添加出库记录
    @Override
    public boolean add(Takeout takeout)throws  Exception{
        boolean falg=true;
        if(takeoutDao.add(takeout)<1){
            falg=false;
        }
        return falg;
    }
}
