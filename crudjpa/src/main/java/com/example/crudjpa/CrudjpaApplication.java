package com.example.crudjpa;

import java.lang.foreign.Linker.Option;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.crudjpa.repo.StudentRepo;

@SpringBootApplication
public class CrudjpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CrudjpaApplication.class, args);
		StudentRepo stdre = context.getBean(StudentRepo.class);
//		Student std1=new Student();
//		std1.setName("baaa");
//		std1.setSection("2-sem");
//		std1.setAddress("bhaktapur");
//		Student std2=new Student();
//		std2.setName("ram");
//		std2.setSection("1-sem");
//		std2.setAddress("lalitpur");
//		// saving single user
//	stdre.save(std1);
//	stdre.save(std2);
//		Student std1 = new Student();
//		std1.setName("Ram");
//		std1.setSection("1-sem");
//		std1.setAddress("Lalitpur");
//
//		Student std2 = new Student();
//		std2.setName("Sita");
//		std2.setSection("2-sem");
//		std2.setAddress("Kathmandu");
//
//		Student std3 = new Student();
//		std3.setName("Hari");
//		std3.setSection("3-sem");
//		std3.setAddress("Bhaktapur");
//
//		Student std4 = new Student();
//		std4.setName("Gita");
//		std4.setSection("1-sem");
//		std4.setAddress("Pokhara");
//
//		Student std5 = new Student();
//		std5.setName("Ramesh");
//		std5.setSection("2-sem");
//		std5.setAddress("Biratnagar");
//
//		// saving more than one users
//		List<Student> students = List.of(std1, std2, std3, std4, std5);
//		Iterable<Student> result = stdre.saveAll(students);
// print more than one value
//		result.forEach(student -> {
//			System.out.println(student);

//		});

		// update the value
//		Optional<Student>studen=stdre.findById(2);
//        
//		Student up1=studen.get();
//    	System.out.println("before");
//    	System.out.println(studen);
//        up1.setName("raju");
//        System.out.println("Afetr");
//		System.out.println(studen);

		// find or read the value
//		List <Student> student=(List<Student>) stdre.findAll();
//		System.out.println("sudess");
//		student.forEach(students->System.out.println(students));
		
		Iterable <Student>std=stdre.findAll();
		std.forEach(student->System.out.println(student));
		System.out.println("after deletion");
		
		// delete
		Optional<Student> student = stdre.findById(8);
		student.ifPresent(s -> stdre.deleteById(8));
		System.out.println("before deleting");
	// vprint the value
		Iterable <Student>std1=stdre.findAll();
		std1.forEach(student1->System.out.println(student1));
		System.out.println(" deletion");
		

		
	}

}
