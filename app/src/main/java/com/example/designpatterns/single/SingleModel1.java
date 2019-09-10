package com.example.designpatterns.single;

public class SingleModel1 {
    /**
     * 单例模式（静态内部类）
     */

    private SingleModel1() {
    }

    public static final SingleModel1 getInstance() {
        return SingleModel1Instance.singleModel;
    }

    private static class SingleModel1Instance {
        private static final SingleModel1 singleModel = new SingleModel1();

    }
}
