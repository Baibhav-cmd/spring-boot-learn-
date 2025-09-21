package com.example.customquery;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.customquery.repo.Teacherrepo;

@SpringBootApplication
public class CustomqueryApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(CustomqueryApplication.class, args);
		Teacherrepo repo = context.getBean(Teacherrepo.class);
//		Teacher t1 = new Teacher();
//		t1.setName("aaa");
//		t1.setEmail("baaa@gmail.com");
//		Teacher t2 = new Teacher();
//		t2.setName("bbb");
//		t2.setEmail("bbbb@gmail.com");
//		Teacher t3 = new Teacher();
//		t3.setName("cccc");
//		t3.setEmail("cccccc@gmail.com");
//		
//		System.out.println("sucess");
//		Iterable<Teacher> teasher = List.of(t1, t2, t3);
//
//		Iterable<Teacher> teacher = repo.saveAll(teasher);
//		teacher.forEach(teacherdata->System.out.println(teacherdata));
//		long data = repo.count();
//		System.out.println(data);
		   List<Teacher>teacher=repo.getTeacher();
		   teacher.forEach(aaa->System.out.println(aaa));
	}

}
