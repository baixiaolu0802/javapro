package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public abstract class Shape {
    public double area;
    public double per;
    public  String color;

    public  Shape(){

    }

    public Shape(String color){
        this.color = color;
    }

    public abstract void getArea();
    public abstract void getPer();
    public abstract void showAll();
}
