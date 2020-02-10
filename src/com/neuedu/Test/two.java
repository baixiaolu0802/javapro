package com.neuedu.Test;

/**
 * Created by 13930 on 2020/2/4.
 */
public class two {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1;i <= 100; i++){
            if(i % 2 == 0){
                sum +=i;
            }
        }
        System.out.println(sum);
    }
}
