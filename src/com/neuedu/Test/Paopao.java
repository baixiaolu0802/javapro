package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public class Paopao {
    public static void main(String[] args) {
        int[] array = {1,4,2,15,8,64,32,100,86};
        for(int i = 0;i < array.length-1;i++){
            int flag = 0;
            for (int j = 0;j < array.length-1-i;j++){
                if(array[j]>array[j+1]) {
                    int tempt = 0;
                    tempt = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tempt;
                    flag++;
                }
            }
            if(flag == 0){
                break;
            }
        }
        for(int a :array){
            System.out.println(a);
        }
    }
}
