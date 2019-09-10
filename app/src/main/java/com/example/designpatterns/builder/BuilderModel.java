package com.example.designpatterns.builder;

import android.util.Log;

/**
 * builder模式  建造者模式
 * 解耦，思路清晰，链试调用，一切交给builder内部来实现
 */
public class BuilderModel {

    public void method() {
        Car car = new Car.Builder()
                .setCheJia("bwm")
                .setYinQing("bwm")
                .setLunTai("bwm")
                .builder();
        Log.i("tag", "aaa");
    }

}
