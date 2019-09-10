package com.example.designpatterns.factory;

/**
 * 工厂模式
 * 优势：解耦，我们可以通过工厂传入不同参数拿到不同对象，不必关心工厂内部怎么实现
 */
public class FactoryModel {
    public void method() {
        ShapeFactory shapeFactory = new ShapeFactory();
        Yuanxing yuanxing = (Yuanxing) shapeFactory.getShape(ShapeFactory.YUAN);
        yuanxing.yuanxingShape();
        yuanxing.draw();
    }
}
