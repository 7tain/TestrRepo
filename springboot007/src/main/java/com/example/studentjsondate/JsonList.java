package com.example.studentjsondate;

import com.example.pojo.Student;
import lombok.Data;

import java.util.List;

@Data
public class JsonList {
    private Integer statue;
    private String info;

    List<Student> list;
}
