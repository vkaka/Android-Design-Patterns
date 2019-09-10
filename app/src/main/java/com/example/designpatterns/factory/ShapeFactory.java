package com.example.designpatterns.factory;

public class ShapeFactory {
    public static String YUAN = "yuanxing";
    public static String FANG = "fangxing";
    public static String SANJIAO = "sanjiaoxing";
    public Shape shape;

    public Shape getShape(String type) {
        if (YUAN.equalsIgnoreCase(type)) {
            shape = new Yuanxing();
        } else if (FANG.equalsIgnoreCase(type)){
            shape = new Fangxing();
        } else if (SANJIAO.equalsIgnoreCase(type)) {
            shape = new Sanjiaoxing();
        }
        return shape;
    }
}
