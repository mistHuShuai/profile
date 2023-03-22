package com.dyhhh;

public class YouJiekou implements IYouJiekou {
    @Override
    public void yr(){
        System.out.println("有接口咬人");
    }
    @Override
    public void tw(String x, int y){
        System.out.println(x+"有接口跳舞"+y);
    }
}
