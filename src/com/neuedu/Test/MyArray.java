package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public class MyArray {
    private int[] array;
    private  int size;
    public MyArray(){
        size = 0;
        array = new int[10];
    }
    public int getSize(){
        return  size;
    }
    public  void add(int i){
        if(size>=array.length){
            int[] newarray = new int[size+size/2];
            for(int j=0;j < array.length;j++){
                newarray[j]=array[j];
            }
            array = newarray;
            System.out.println("新数组长度为"+array.length);
        }
        array[size++]=i;
    }
    public  int get(int i){
        if(i<0||i>=size){
            System.out.println("索引错误");
            return -1;
        }
        return array[i];
    }
}
