package com.neuedu.Test.web;

import com.neuedu.Test.model.Student;
import com.neuedu.Test.server.IstudentServer;
import com.neuedu.Test.server.StudentServer;

import java.util.List;
import java.util.Scanner;

/**
 * Created by 13930 on 2020/2/18.
 */
public class StudentWeb {
    IstudentServer studentServer = new StudentServer();
    public void showmain(){
        System.out.println("---------------------------");
        System.out.println("1-----------------------查询");
        System.out.println("2-----------------------添加");
        System.out.println("3-----------------------修改");
        System.out.println("4-----------------------删除");
        System.out.println("其他--------------------退出");
        System.out.println("---------------------------");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        int i =scanner.nextInt();
        if (i==1){
            query();
        }
    }
    public void query(){
        List<Student> list = studentServer.query();
        for (Student student : list){
            System.out.println(student);
        }
    }
}
