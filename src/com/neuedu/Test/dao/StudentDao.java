package com.neuedu.Test.dao;

import com.neuedu.Test.model.Student;
import com.neuedu.Test.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 13930 on 2020/2/18.
 */
public class StudentDao implements IstudentDao{
    String url = "jdbc:mysql://192.168.138.130:3306/MyDB?useUnicode=true&characterEncoding=utf8";
    String username = "root";
    String password = "root";

    @Override
    public List<Student> query() {
       List<Student> list = JdbcUtil.executeQuery("select id,name,age,gender from Student",Student.class);
        return list;
    }

    @Override
    public int add(Student student) {
        return JdbcUtil.executeUpdate("insert into Student(name,age,gender) values(?,?,?)",student.getName(),student.getAge(),student.getGender());
    }

    @Override
    public int update(Student student) {
        return  JdbcUtil.executeUpdate("updae student set name=?,age=?,gender=? where id=?",student.getName(),student.getAge(),student.getGender(),student.getId());

    }

    @Override
    public int del(int id) {
        return  JdbcUtil.executeUpdate("delete from student where id=?",id);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
