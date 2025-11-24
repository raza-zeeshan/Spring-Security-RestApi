package com.SpringBootDemo.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringBootDemo.dto.TeacherDto;
import com.SpringBootDemo.entity.Teacher;
import com.SpringBootDemo.repositiry.TeacherRepository;

@Service
public class TeacherImpl implements TeacherService {
	@Autowired
	private TeacherRepository repository;

	public Teacher convetdto(TeacherDto dto) {
		Teacher tch = new Teacher();
		BeanUtils.copyProperties(dto, tch);
		return tch;
	}

	@Override
	public Teacher saveTeacher(TeacherDto dto) {
		return repository.save(convetdto(dto));
	}

}
