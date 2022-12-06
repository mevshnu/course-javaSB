package com.example.course.controller;


import com.example.course.dao.Coursedao;
import com.example.course.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Coursedata {
    @Autowired
    private Coursedao dao;

    @CrossOrigin(origins ="*")
    @GetMapping("/")
    public String Homepage()
    {
        return "welcome to homepage";
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/viewall")
    public List<Course> Viewall()
    {
        return (List<Course>) dao.findAll();
    }
    @PostMapping(path="/add",consumes ="application/json",produces = "application/json")
    public String Add(@RequestBody Course c)
    {
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        dao.save(c);
        return "course added Successfully";
    }

}
