package com.example.designpatterns;

import com.example.designpatterns.facade.FacadeModel;
import com.example.designpatterns.factory.FactoryModel;
import com.example.designpatterns.factory.ShapeFactory;
import com.example.designpatterns.factory.factory.ProductA;
import com.example.designpatterns.factory.factory.ProductB;
import com.example.designpatterns.factory.factory.ProductFactory;
import com.example.designpatterns.prototype.WordDocument;
import com.example.designpatterns.proxy.dynamic_proxy.DynamicProxyDemo;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
//        FactoryModel factoryModel = new FactoryModel();
//        factoryModel.method();

        WordDocument wordDocument = new WordDocument();
        wordDocument.setTitle("title");
        wordDocument.addBitmap("b1");
        wordDocument.addBitmap("b2");
        wordDocument.show();
        WordDocument wordDocument1 = (WordDocument) wordDocument.clone();
        wordDocument1.setTitle("haha");
        wordDocument1.addBitmap("bb");
        wordDocument.show();
        wordDocument1.show();

        ProductFactory productFactory = new ProductFactory();
        ProductB product = productFactory.createProduct(ProductB.class);
        product.show();

        DynamicProxyDemo dynamicProxyDemo = new DynamicProxyDemo();
        dynamicProxyDemo.run();

//        assertEquals(4, 2 + 2);
    }
}