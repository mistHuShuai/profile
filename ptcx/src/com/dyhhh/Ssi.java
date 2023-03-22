package com.dyhhh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Ssi implements InvocationHandler {
    private Object oo;

    public Ssi(Object oo) {
        this.oo = oo;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前拦截");
        method.invoke(oo,args);
        return null;
    }
}
