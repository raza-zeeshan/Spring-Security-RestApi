package com.SpringBootDemo.service;

import com.SpringBootDemo.dto.TeacherDto;
import com.SpringBootDemo.entity.Teacher;

public interface TeacherService {
	Teacher saveTeacher(TeacherDto dto);
}
