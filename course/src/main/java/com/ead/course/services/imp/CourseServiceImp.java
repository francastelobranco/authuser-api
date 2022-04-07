package com.ead.course.services.imp;

import com.ead.course.repositories.CourseRepository;
import com.ead.course.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImp implements CourseService {

    @Autowired
    CourseRepository courseRepository;
}
