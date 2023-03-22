package com.dyhhh;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Testa {
    private static void ff(String classname) {

        try {
            Class<?> aClass = Class.forName(classname);
            Class<?>[] interfaces = aClass.getInterfaces();
            if(interfaces.length!=0){
                System.out.println("有接口,使用动态代理");


                ClassLoader a=aClass.getClassLoader();

                Class<?>[] b=aClass.getInterfaces();

                InvocationHandler c=new  Ssi(aClass.newInstance());

                IYouJiekou o = (IYouJiekou) Proxy.newProxyInstance(a, b, c);

                o.tw("kkk",5);

            }else {
                System.out.println("无接口，使用cglib代理");

                Enhancer x=new Enhancer();
                x.setSuperclass(aClass);
                Callback xx= new Xyz(aClass.newInstance());
                x.setCallback(xx);
                Wujiekou o = (Wujiekou) x.create();
                o.cf("qq");
                o.zl();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        ff("com.dyhhh.Wujiekou");

    }


}
