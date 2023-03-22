package com.dyja21.service;

import com.dyja21.dao.ITxl_dao;
import com.dyja21.entity.Ren;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;
@Service
public class Txl_service implements ITxl_service {

    @Autowired
    private ITxl_dao iTxl_dao;
    @Override
    public Map<String, Object> zj(Ren ren) {



        System.out.println(" --service"+ren.getXma()+"---"+ren.getDha());


        String xgh=new StringBuilder(ren.getXma()).reverse().toString();

        ren.setXma(xgh);
        iTxl_dao.zj(ren);

        return null;
    }
}
