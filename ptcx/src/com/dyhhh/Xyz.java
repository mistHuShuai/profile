package com.dyhhh;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class Xyz implements MethodInterceptor {
    private Object aa;

    public Xyz(Object aa) {
        this.aa = aa;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("倩倩拦截");
        Object invoke = method.invoke(aa, objects);
        return invoke;
    }
}
