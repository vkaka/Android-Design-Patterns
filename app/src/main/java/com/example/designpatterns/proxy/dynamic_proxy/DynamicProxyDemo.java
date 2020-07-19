package com.example.designpatterns.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author : zhangce
 * 动态代理模式
 * date: on 2019-11-17
 **/
public class DynamicProxyDemo {
    private RealSubject realSubject = new RealSubject();
    private ProxyHandle proxyHandle = new ProxyHandle(realSubject);

    public void run() {
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(), proxyHandle);
        subject.request();
    }

}

/**
 * 主题接口
 */
interface Subject {
    void request();
}

/**
 * 目标实现接口
 */
class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("请求网络操作");
    }
}

/**
 * 代理类的调用处理器
 */
class ProxyHandle implements InvocationHandler {

    private RealSubject realSubject;

    public ProxyHandle(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("网络请求之前");

        System.out.println(proxy.getClass().toString());

        Object invoke = method.invoke(realSubject, args);

        System.out.println("网络请求之后");

        return invoke;
    }
}
