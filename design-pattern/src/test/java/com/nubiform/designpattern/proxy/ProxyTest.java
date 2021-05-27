package com.nubiform.designpattern.proxy;

import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

class ProxyTest {

    @Test
    public void test() {
        Service service = new ServiceProxy(new ServiceImpl());

        service.runSomething();
    }

    @Test
    public void dynamicTest() {
        Service service = (Service) Proxy.newProxyInstance(
                Service.class.getClassLoader(),
                new Class[]{Service.class},
                new InvocationHandler() {
                    Service service = new ServiceImpl();

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("before");
                        Object invoke = method.invoke(service, args);
                        System.out.println("after");
                        return invoke;
                    }
                });

        service.runSomething();
    }
}