package com.example.designpatterns.single;

/**
 * 单例模式（双重验证锁机制）
 */
public class SingleModel {
    private static volatile SingleModel singleModel;

    private SingleModel() {
    }

    public static SingleModel getInstance() {
        if (singleModel == null) {
            //多线程并发时，此处可能进入多个线程争抢资源
            //需要通过加锁来做进一步的控制
            synchronized (SingleModel.class) {
                if (singleModel == null) {
                    singleModel = new SingleModel();
                }
            }
        }
        return singleModel;
    }
}
