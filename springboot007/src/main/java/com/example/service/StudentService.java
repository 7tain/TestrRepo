package com.example.service;

import com.example.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface StudentService {
    Boolean add( Student student);
    Boolean del(Integer studentId);
    Boolean update( Student student);
    Student findBy(Integer studentId);

    List<Student> findAll();
}
