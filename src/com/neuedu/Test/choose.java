package com.neuedu.Test;
/**
 * Created by 13930 on 2020/2/5.
 */
public class choose {
    public static void main(String[] args) {
        int[] array = {1,4,2,15,8,64,32,100,86};
        for (int i = 0 ; i < array.length-1 ; i++){
            for (int j = i+1;j < array.length ; j++){
                if(array[j]<array[i]){
                    int tempt = 0;
                    tempt = array[j];
                    array[j] = array[i];
                    array[i] = tempt;
                }
            }
        }
        for(int a :array){
            System.out.println(a);
        }
    }
}
