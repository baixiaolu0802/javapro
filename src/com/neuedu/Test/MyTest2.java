package com.neuedu.Test;

/**
 * Created by 13930 on 2020/2/13.
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(method(3));
    }
    public  static int method(int n){
        if (n==1||n==2){
            return 1;
        }else {
            int n1 = 1;
            int n2 = 1;
            int sum;
            for (int i=3;i<=n;i++){
                sum = n1+n2;
                n1=n2;
                n2=sum;
            }
            return n2;
        }
    }
}
