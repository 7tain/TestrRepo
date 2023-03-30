package com.example.mapper;

import com.example.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface StudentMapper {
    Integer add(@Param(value = "student") Student student);
    Integer del(Integer studentId);
    Integer update(@Param(value = "student01") Student student);
     Student findBy(Integer studentId);

     List<Student>  findAll();
}
