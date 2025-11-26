package com.SpringBootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBootDemo.dto.ResponseStructure;
import com.SpringBootDemo.dto.TeacherDto;
import com.SpringBootDemo.entity.Teacher;
import com.SpringBootDemo.service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

	@Autowired
	private TeacherService service;

//	private TeacherRepository teacherRepository;

	// ---------------------get/fetch-----------------------

//	@GetMapping("/find/{id}")
//	public Teacher find(@PathVariable int id) {
////		Teacher t = teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("invalid id"));
////		return t;
//	}
//
//	@GetMapping("/findAll")
//	public List<Teacher> getAll() {
//		List<Teacher> list = teacherRepository.findAll();
//		return list;
//	}
//
//	@GetMapping("/getbyage")
//	public List<Teacher> getByAge(@RequestParam Integer age) {
//		return teacherRepository.findByAge(age);
//	}
//
//	@GetMapping("/getbyname")
//	public List<Teacher> getByName(@RequestParam String name) {
//		return teacherRepository.findByName(name);
//	}
//
//	@GetMapping("/getbynameandage")
//	public List<Teacher> getByNameAge(@RequestBody Teacher teacher) {
//		Teacher t = new Teacher();
//		t.setAge(teacher.getAge());
//		t.setName(teacher.getName());
//
//		Example of = Example.of(t);
//
//		return teacherRepository.findAll(of);
//	}

	// ----------------------create/save-------------------------

	@PostMapping("/save")
	public ResponseEntity<ResponseStructure<Teacher>> save(@RequestBody TeacherDto dto) {
		System.out.println(dto.getName());
		Teacher tch = service.saveTeacher(dto);

		ResponseStructure<Teacher> rsp = new ResponseStructure<Teacher>();
		rsp.setStatus(HttpStatus.OK);
		rsp.setMsg("SUCCESSFULL");
		rsp.setData(tch);
		return new ResponseEntity(rsp, HttpStatus.CREATED);

	}

	// --------------------delete------------------

//	@DeleteMapping("delete")
//	public String delete(@RequestParam Integer id) {
//		int i = 1 / 0;
//		System.out.println("data is to be deleted");
//		teacherRepository.deleteById(id);
//		return "data deleted id: " + id;
//	}

//	@DeleteMapping("deletebyid")
//	public String deletebyid(@RequestParam Integer id) {
//		System.out.println("data is to be saved");
//		Teacher t = teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("inavalid id"));
//		teacherRepository.delete(t);
//		return "data deleted id: " + id;
//	}
//
//	// ---------------------update---------------
//
//	@PutMapping("/update")
//	public Teacher update(@RequestBody Teacher teacher) {
//		teacherRepository.findById(teacher.getId()).orElseThrow(() -> new RuntimeException("ID not found"));
//		Teacher t = teacherRepository.save(teacher);
//		return t;
//	}

	@ExceptionHandler
	public String ExceptionHandler(Exception ex) {
		System.out.println(ex.getMessage());

		return "exception handled";

	}

}
