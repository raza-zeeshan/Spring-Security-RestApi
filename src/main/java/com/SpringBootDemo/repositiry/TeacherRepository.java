package com.SpringBootDemo.repositiry;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringBootDemo.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	@Query("select s from Teacher s where s.age=:age")
	List<Teacher> findByAge(Integer age);

	List<Teacher> findByName(String name);
}
