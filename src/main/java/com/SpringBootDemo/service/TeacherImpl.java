package com.SpringBootDemo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootDemo.entity.Teacher;
import com.SpringBootDemo.repositiry.TeacherRepository;

@Service
public class TeacherImpl implements TeacherService {
	@Autowired
	private TeacherRepository repository;

	@Override
	public Teacher saveTeacher(Teacher teacher) {
		return repository.save(teacher);
	}

}
