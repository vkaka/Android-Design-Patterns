package com.example.designpatterns.prototype;

import java.util.ArrayList;

/**
 * author : zhangce
 * date: on 2019-11-14
 * 原型模式
 * 用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象
 * <p>
 * 原型模式是一个比较简单的模式，他的核心问题就是对原始对象进行拷贝，在这个模式的使用过程中需要注意的一点就是
 * 对象的深浅拷贝的问题
 **/
public class WordDocument implements Cloneable {

    private String title;
    private ArrayList<String> bitmaps = new ArrayList<>();

    public void addBitmap(String url) {
        if (bitmaps != null) {
            bitmaps.add(url);
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getBitmaps() {
        return bitmaps;
    }

    public void setBitmaps(ArrayList<String> bitmaps) {
        this.bitmaps = bitmaps;
    }

    public void show() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("title: " + title + "/n");
        for (String s : bitmaps) {
            stringBuilder.append("bitmap: " + s + "/n");
        }
        System.out.println(stringBuilder.toString());
    }

    @Override
    public WordDocument clone() {
        WordDocument wordDocument = null;
        try {
            wordDocument = (WordDocument) super.clone();
            wordDocument.bitmaps = (ArrayList<String>) bitmaps.clone();
            return wordDocument;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;

    }
}
