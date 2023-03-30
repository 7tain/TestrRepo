package com.example.controller;

import com.example.pojo.Student;
import com.example.service.StudentService;
import com.example.studentjsondate.JsonList;
import com.example.studentjsondate.JsonStu;
import com.example.studentjsondate.StudentJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public StudentJson add(@RequestBody Student student) {
        boolean isok = studentService.add(student);
        String info = "添加失败";
        String data = "false";
        if (isok == true) {
            info = "添加成功";
            data = "true";
        }
        StudentJson studentJson=new StudentJson();
        studentJson.setStatue(200);
        studentJson.setInfo(info);
        studentJson.setData(data);
      return studentJson;

    }
    @DeleteMapping("/{studentId}")
    public StudentJson del(@PathVariable Integer studentId) {
        boolean isok = studentService.del(studentId);
        String info = "删除失败";
        String data = "false";
        if (isok == true) {
            info = "删除成功";
            data = "true";
        }
        StudentJson studentJson=new StudentJson();
        studentJson.setStatue(200);
        studentJson.setInfo(info);
        studentJson.setData(data);
        return studentJson;

    }
    @PutMapping
    public StudentJson update( @RequestBody Student  student){
        boolean isok=studentService.update(student);
        String info="更新失败";
        String date="false";
        if(isok==true){
            info="更新成功";
            date="true";
        }
        StudentJson studentJsonData=new StudentJson();
        studentJsonData.setStatue(200);
        studentJsonData.setInfo(info);
        studentJsonData.setData(date);

        return studentJsonData;
    }
    @GetMapping("/{studentId}")
    public JsonStu find(@PathVariable Integer studentId){
        Student student =studentService.findBy(studentId);
      JsonStu setstudent=new JsonStu();
        setstudent.setStatue(200);
        setstudent.setInfo("查询数据");
        setstudent.setStatue(studentId);
        return setstudent;
    }

    @GetMapping
    public JsonList  findAll(){
       List<Student> list= (List<Student>) studentService.findAll();
       JsonList jsonList=new JsonList();
       jsonList.setStatue(200);
       jsonList.setInfo("查询所有数据");
       jsonList.setList(list);
        return  jsonList;
    }
}
