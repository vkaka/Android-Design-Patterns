package com.example.designpatterns.factory;


public class Yuanxing implements Shape {
    public void yuanxingShape() {
        System.out.println("创建圆形");
    }

    @Override
    public void draw() {
        System.out.println("画圆形");
    }
}
