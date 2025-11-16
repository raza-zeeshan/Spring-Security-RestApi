package com.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.SpringBootDemo.repositiry.TeacherRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
		System.out.println(run.getClass());

		TeacherRepository teacherRepository = run.getBean(TeacherRepository.class);

		// *************************add/insert data to
		// database****************************

//		Teacher teacher = new Teacher();

//		teacher.setId(2002);
//		teacher.setName("Hari");
//		teacher.setAge(21);
//		teacherRepository.save(teacher);
//		System.out.println(teacher);

		// ************************find single data from database**********************

//		Teacher tch = teacherRepository.findById(2002).orElseThrow(() -> new RuntimeException("USER NOT FOUND "));
//		System.out.println(tch);

		// *************************fetch all data from database************************

//		List<Teacher> all = teacherRepository.findAll();
//		for (Teacher t : all) {
//			System.out.println(t.getId() + " " + t.getName());
//
//		}

		// ********************* add multiple data at a single hit*****************

//		Teacher teacher = new Teacher();
//
//		teacher.setId(2003);
//		teacher.setName("Mahesh");
//		teacher.setAge(21);
//
//		Teacher teacher2 = new Teacher();
//		teacher2.setAge(24);
//		teacher2.setName("Ramesh");
//		teacher2.setId(2004);
//		Teacher teacher3 = new Teacher();
//		teacher3.setAge(24);
//		teacher3.setName("Suresh");
//		teacher3.setId(2005);
//
//		ArrayList<Teacher> list = new ArrayList<Teacher>();
//		list.add(teacher);
//		list.add(teacher2);
//		list.add(teacher3);
//
//		List<Teacher> saveAll = teacherRepository.saveAll(list);
//		for (Teacher t : saveAll) {
//			System.out.println(t.getId() + " " + t.getName());
//
//		}

		// ***************fetch the data in sorting order******************

//		List<Teacher> sortList = teacherRepository.findAll(Sort.by("name").descending());
//
//		for (Teacher teacher : sortList) {
//			System.out.println(teacher.getId() + " " + teacher.getName());
//		}
	}

}
