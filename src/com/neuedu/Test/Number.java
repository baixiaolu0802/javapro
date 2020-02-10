package com.neuedu.Test;

/**
 * Created by 13930 on 2020/2/4.
 */
public class Number {
    public static void main(String[] args) {
        int count = 0;
        int[] array = {1,2,3,4};
        for(int i:array){
            for(int j:array){
                for(int k:array){
                    if (i!=j && i!=k && j!=k) {
                        System.out.println(i*100+j*10+k);
                        count++;
                    }
                }
            }
        }
        System.out.println("能组成"+count+"个不重复三位数");
    }
}
