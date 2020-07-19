package com.example.designpatterns.factory.factory;

/**
 * author : zhangce
 * date: on 2019-11-14
 **/
public class ProductFactory {
    public <T extends Product> T createProduct(Class<T> clz) {
        Product p = null;
        try {
            p = (Product) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (T) p;
    }
}
