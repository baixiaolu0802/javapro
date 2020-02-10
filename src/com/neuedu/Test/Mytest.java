package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public class Mytest {
    public static void main(String[] args) {
        Circle circle = new Circle(2,"black");
        Rectangle rectangle = new Rectangle(3,5,"red");
        circle.getArea();
        circle.getPer();
        circle.showAll();

        rectangle.getArea();
        rectangle.getPer();
        rectangle.showAll();
    }
}
