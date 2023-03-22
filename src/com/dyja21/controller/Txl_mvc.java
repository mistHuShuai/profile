package com.dyja21.controller;

import com.dyja21.entity.Ren;
import com.dyja21.service.ITxl_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Txl_mvc {

    @Autowired
    private ITxl_service iTxl_service;
    @RequestMapping("aa/txl")
    @ResponseBody
    public Map<String,String> zj(Ren ren){
        Map<String,String> fhz=new HashMap<>();
       System.out.println("-*-controller----"+ren.getXma());
        iTxl_service.zj(ren);
        fhz.put("bt","22");
        return fhz;
    }
    @RequestMapping("aa/xg")
    public Map<String ,Object> xg(Ren ren){


        return null;

    }

}
