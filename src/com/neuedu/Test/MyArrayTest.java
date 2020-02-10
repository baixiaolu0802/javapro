package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public class MyArrayTest {
    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        for(int i = 1;i <= 20;i++){
            myArray.add(i);
        }
        for(int i=0;i<myArray.getSize();i++){
            System.out.println(myArray.get(i));
        }
    }

}
