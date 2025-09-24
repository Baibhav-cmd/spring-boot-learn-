package com.example.restapiexec.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.example.restapiexec.Student;

@Component
public class StudentSerrvice {

Student std=new  Student();
	Student s1=new Student(1,"baibhva","bca 8");
	Student s2=new Student(2,"ram","bca 2");
	Student s3=new Student(3,"Hari","bca 3");
	
	// add the data
	List<Student> stu = new ArrayList<>(List.of(s1, s2, s3));

	
	
	// getting all the data
	public List <Student> getdata() {
		return stu;
		
	}
	
	// getting the data by id
	public Student getbyid(int id) {
	  Student stud= stu.stream().filter(stu->stu.getId()==id).findFirst().orElse(null);
	return stud;
	}
	// posting the request
	
	public Student postdata(Student stup){
		stu.add(stup);
		return stup;
		
	
	}
	
	//deleting 
	public void deletedata(int id) {
		stu.removeIf(student->student.getId()==id);
	}
	
	// updatedata
	
	public Student updatedata(Student s,int id) {
		stu=stu.stream().map(student->{
			if(student.getId()==id) {
				s.setName(student.getName());
			    s.setSection(student.getSection());
			}
			
				return s;
			
		
		
					}).collect(Collectors.toList());
		return s;
	}


	
	
}