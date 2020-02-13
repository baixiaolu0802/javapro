package com.neuedu.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by 13930 on 2020/2/13.
 */
public class chatNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("输入总人数");
        int p = input.nextInt();
        System.out.println(baoshu(p));
    }
    public static int baoshu(int n){
        List<Integer> list = new ArrayList<>();
        for (int i = 1;i <= n;i++)  {
            list.add(i);
        }
        int count = 1;
        while (list.size()>1){
            if (count!=3){
                int first = list.remove(0);
                list.add(first);
                count++;
            }else {
                list.remove(0);
                count = 1;
            }
        }
        return list.get(0);
    }
}
