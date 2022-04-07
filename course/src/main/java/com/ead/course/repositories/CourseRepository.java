package com.ead.course.repositories;

import com.ead.course.moldes.CourseModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CourseRepository extends JpaRepository<CourseModel, UUID> {

}
