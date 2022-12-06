package com.example.course.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="courses")
public class Course {
    @Id
    @GeneratedValue
    private int id;
    private String CourseTitle;
    private String CourseDescription;
    private String CourseVenue;
    private String CourseDuration;
    private String CourseDate;

    public Course() {
    }

    public Course(int id, String courseTitle, String courseDescription, String courseVenue, String courseDuration, String courseDate) {
        this.id = id;
        CourseTitle = courseTitle;
        CourseDescription = courseDescription;
        CourseVenue = courseVenue;
        CourseDuration = courseDuration;
        CourseDate = courseDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCourseTitle() {
        return CourseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        CourseTitle = courseTitle;
    }

    public String getCourseDescription() {
        return CourseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        CourseDescription = courseDescription;
    }

    public String getCourseVenue() {
        return CourseVenue;
    }

    public void setCourseVenue(String courseVenue) {
        CourseVenue = courseVenue;
    }

    public String getCourseDuration() {
        return CourseDuration;
    }

    public void setCourseDuration(String courseDuration) {
        CourseDuration = courseDuration;
    }

    public String getCourseDate() {
        return CourseDate;
    }

    public void setCourseDate(String courseDate) {
        CourseDate = courseDate;
    }
}
