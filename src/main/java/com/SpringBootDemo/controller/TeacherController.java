package com.SpringBootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.entity.Teacher;
import com.SpringBootDemo.repositiry.TeacherRepository;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherRepository teacherRepository;

	// ---------------------get/fetch-----------------------

	@GetMapping("/find/{id}")
	public Teacher find(@PathVariable int id) {
		Teacher t = teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("invalid id"));
		return t;
	}

	@GetMapping("/findAll")
	public List<Teacher> getAll() {
		List<Teacher> list = teacherRepository.findAll();
		return list;
	}

	@GetMapping("/getbyage")
	public List<Teacher> getByAge(@RequestParam Integer age) {
		return teacherRepository.findByAge(age);
	}

	@GetMapping("/getbyname")
	public List<Teacher> getByName(@RequestParam String name) {
		return teacherRepository.findByName(name);
	}

	@GetMapping("/getbynameandage")
	public List<Teacher> getByNameAge(@RequestBody Teacher teacher) {
		Teacher t = new Teacher();
		t.setAge(teacher.getAge());
		t.setName(teacher.getName());

		Example of = Example.of(t);

		return teacherRepository.findAll(of);
	}

	// ----------------------create/save-------------------------

	@PostMapping("/save")
	public String save(@RequestBody Teacher teacher) {
		System.out.println(teacher.getName());
		Teacher save = teacherRepository.save(teacher);
		if (save.getId() != 0) {
			return "data saved for " + save.getName();
		} else {
			return "data not saved for" + save.getName();
		}
	}

	// --------------------delete------------------

	@DeleteMapping("delete")
	public String delete(@RequestParam Integer id) {
		int i = 1 / 0;
		System.out.println("data is to be deleted");
		teacherRepository.deleteById(id);
		return "data deleted id: " + id;
	}

	@DeleteMapping("deletebyid")
	public String deletebyid(@RequestParam Integer id) {
		System.out.println("data is to be saved");
		Teacher t = teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("inavalid id"));
		teacherRepository.delete(t);
		return "data deleted id: " + id;
	}

	// ---------------------update---------------

	@PutMapping("/update")
	public Teacher update(@RequestBody Teacher teacher) {
		teacherRepository.findById(teacher.getId()).orElseThrow(() -> new RuntimeException("ID not found"));
		Teacher t = teacherRepository.save(teacher);
		return t;
	}

	@ExceptionHandler
	public String ExceptionHandler(Exception ex) {
		System.out.println(ex.getMessage());

		return "exception handled";

	}

}
