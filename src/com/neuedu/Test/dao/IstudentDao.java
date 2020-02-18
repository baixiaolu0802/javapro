package com.neuedu.Test.dao;

import com.neuedu.Test.model.Student;

import java.util.List;

/**
 * Created by 13930 on 2020/2/18.
 */
public interface IstudentDao {
    List<Student> query();
    int add(Student student);
    int update(Student student);
    int del(int id);
    Student queryOne(int id);
}
