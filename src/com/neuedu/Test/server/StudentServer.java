package com.neuedu.Test.server;

import com.neuedu.Test.dao.StudentDao;
import com.neuedu.Test.model.Student;

import java.util.List;

/**
 * Created by 13930 on 2020/2/18.
 */
public class StudentServer implements IstudentServer {
    StudentDao studentDao = new StudentDao();

    @Override
    public List<Student> query() {
        return studentDao.query();
    }

    @Override
    public int add(Student student) {
        return studentDao.add(student);
    }

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int del(int id) {
        return studentDao.del(id);
    }

    @Override
    public Student queryOne(int id) {
        return null;
    }
}
