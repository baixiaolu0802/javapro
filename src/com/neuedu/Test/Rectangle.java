package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(){

    }
    public Rectangle(double width,double height,String color){
        super(color);
        this.width = width;
        this.height = height;
    }
    @Override
    public  void getArea(){
        area = width * height;
    }

    @Override
    public void getPer(){
        per = (width + height)*2;
    }

    public void showAll(){
        System.out.println("矩形面积为"+area+"矩形周长为"+per+"颜色为"+color);
    }
}
