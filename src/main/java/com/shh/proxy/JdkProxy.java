package com.shh.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy {
    public Shop createProxy(final Shop shop) {
        ClassLoader loader = shop.getClass().getClassLoader();
        Class[] interfaces = shop.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("欢迎！");
                Object result = method.invoke(shop, args);
                System.out.println("再见！");
                return result;
            }
        };
        return (Shop) Proxy.newProxyInstance(loader, interfaces, h);
    }
}
