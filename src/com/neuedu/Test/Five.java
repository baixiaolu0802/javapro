package com.neuedu.Test;

/**
 * Created by 13930 on 2020/2/4.
 */
public class Five {
    public static void main(String[] args) {
        int a = 6;
        int b = 9;
        int c = gys(a, b);
        int d = gbs(a, b);
        System.out.println(c);
        System.out.println(d);

    }
    public  static int gys(int x, int y){
        if(x>y){
            int t = x;
            x = y;
            y = t;
        }
        while(x!=0){
            int temp = y%x;
            y = x;
            x = temp;
        }
        return y;
    }
    public static  int gbs(int x, int y){
        int m = x,n = y;
        int num = gys(m,n);
        return x*y/num;
    }

}
