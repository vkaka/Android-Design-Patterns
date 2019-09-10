package com.example.designpatterns.factory;

public class Sanjiaoxing implements Shape {
    public void sanjiaoxingShape() {
        System.out.println("创建三角形");
    }

    @Override
    public void draw() {
        System.out.println("画三角形");
    }
}
