package com.neuedu.Test;

/**
 * Created by 13930 on 2020/2/4.
 */
public class Four {
    public static void main(String[] args) {
        for(int i = 100;i <1000;i++){
            int x = i/100;
            int y = (i%100)/10;
            int z = i-x*100-y*10;
            int num = x*x*x+y*y*y+z*z*z;
            if(num == i){
                System.out.println("水仙花数"+i);
            }
        }
    }
}
