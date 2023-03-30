package com.example.service.impl;

import com.example.mapper.StudentMapper;
import com.example.pojo.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;
    @Override
    public Boolean add(Student student) {
        int row=studentMapper.add(student);
        return row>0;
    }

    @Override
    public Boolean del(Integer studentId) {
        int row=studentMapper.del(studentId);
        return row>0;
    }

    @Override
    public Boolean update(Student student) {
        int row=studentMapper.update(student);
        return row>0;
    }

    @Override
    public Student findBy(Integer studentId) {
        return studentMapper.findBy(studentId);
    }

    @Override
    public List<Student> findAll() {
        return studentMapper.findAll();
    }


}
