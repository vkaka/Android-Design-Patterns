package com.example.designpatterns;

import com.example.designpatterns.facade.FacadeModel;
import com.example.designpatterns.factory.FactoryModel;
import com.example.designpatterns.factory.ShapeFactory;

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
        FactoryModel factoryModel = new FactoryModel();
        factoryModel.method();

//        assertEquals(4, 2 + 2);
    }
}