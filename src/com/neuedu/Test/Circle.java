package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public class Circle extends Shape{
    double radius;

    public Circle(){

    }

    public Circle(double radius,String color){
        this.color=color;
        this.radius = radius;
    }

    public void getArea(){
        area = radius*radius*3.14;
    }

    public void getPer(){
        per = 2 *radius*3.14;
    }
    public  void  showAll(){
        System.out.println("圆的面积为：" + area + "，周长为：" + per+",颜色："+color);
    }
}

