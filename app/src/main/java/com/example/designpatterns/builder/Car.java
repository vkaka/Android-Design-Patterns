package com.example.designpatterns.builder;

public class Car {
    private String yinqing;
    private String luntai;
    private String zuoyi;
    private String chejia;
    private String youxiang;

    public Car(Builder builder) {
        this.yinqing = builder.yinqing;
        this.luntai = builder.luntai;
        this.zuoyi = builder.zuoyi;
        this.chejia = builder.chejia;
        this.youxiang = builder.youxiang;
    }

    public static class Builder {
        private String yinqing;
        private String luntai;
        private String zuoyi;
        private String chejia;
        private String youxiang;

        public Builder() {
            //给出默认值
            this.yinqing = "奔驰";
            this.luntai = "奔驰";
            this.zuoyi = "奔驰";
            this.chejia = "奔驰";
            this.youxiang = "奔驰";
        }

        public Builder setYinQing(String s) {
            this.yinqing = s;
            return this;
        }

        public Builder setLunTai(String s) {
            this.luntai = s;
            return this;
        }

        public Builder setZuoYi(String s) {
            this.zuoyi = s;
            return this;
        }

        public Builder setCheJia(String s) {
            this.chejia = s;
            return this;
        }

        public Builder setYouXiang(String s) {
            this.youxiang = s;
            return this;
        }

        public Car builder() {
            return new Car(this);
        }

    }

}
