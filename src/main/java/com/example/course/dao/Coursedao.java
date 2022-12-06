package com.example.course.dao;

import com.example.course.model.Course;
import org.springframework.data.repository.CrudRepository;

public interface Coursedao extends CrudRepository<Course,Integer>
{
}
