package com.shh.proxy;

import net.sf.cglib.proxy.Callback;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {
    public Object createProxy(final Object shop) {
        Class clazz = shop.getClass();
        Callback callback = new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
                System.out.println("欢迎！");
                Object result = method.invoke(shop, args);
                System.out.println("再见！");
                return result;
            }
        };
        return Enhancer.create(clazz, callback);
    }
}
