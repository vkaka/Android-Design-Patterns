package com.example.designpatterns.factory;

public class Fangxing implements Shape {
    public void FangxingShape() {
        System.out.println("创建方形");
    }
    @Override
    public void draw() {
        System.out.println("画方形");
    }
}
