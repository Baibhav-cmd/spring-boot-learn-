package com.example.restapiexec.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapiexec.Student;
import com.example.restapiexec.service.StudentSerrvice;

@RestController
public class StudentController {
	@Autowired
 private StudentSerrvice stds;
 
 @GetMapping("/student")
 public ResponseEntity<List <Student>> getdata(){
	List<Student>student=this.stds.getdata();
	if(student.size()<=0) {
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
	return ResponseEntity.of(Optional.of(student));
	
	 
 }
	@PostMapping("/studentp")
	public ResponseEntity<Student> postdata(@RequestBody Student student){
		Student s=this.stds.postdata(student);
	         if(s==null) {
	        	 return ResponseEntity.status(HttpStatus.NOT_IMPLEMENTED).build();
	         }
	         return ResponseEntity.of(Optional.of(s));
	}
	
	
	@GetMapping("/one/{id}")
	public  ResponseEntity<Student> getbyid(@PathVariable int id) {
		Student s= this.stds.getbyid(id);
		if(s==(null)) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(s));
	} 

	@DeleteMapping("/del/{id}")
	public ResponseEntity<Void> delStudent(@PathVariable int id) {
			 try {
				this.stds.deletedata(id);
                      return ResponseEntity.status(HttpStatus.NO_CONTENT).build();		 
		 }
		 catch(Exception e){
			 e.printStackTrace();
			 return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
		 }
	}

	@PutMapping("/upd/{id}")
	public Student update(@RequestBody Student s,@PathVariable int id) {
		Student stud=this.stds.updatedata(s, id);
		return stud;
	}
	
}
