package com.example.course.controller;


import com.example.course.model.Course;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Coursedata {
    @GetMapping("/")
    public String Homepage()
    {
        return "welcome to homepage";
    }
    @GetMapping("/viewall")
    public String Viewall()
    {
        return "view all";
    }
    @PostMapping(path="/add",consumes ="application/json",produces = "application/json")
    public String Add(@RequestBody Course c)
    {
        System.out.println(c.getCourseTitle().toString());
        System.out.println(c.getCourseDescription().toString());
        System.out.println(c.getCourseVenue().toString());
        System.out.println(c.getCourseDuration().toString());
        System.out.println(c.getCourseDate().toString());
        return "course added Successfully";
    }

}
