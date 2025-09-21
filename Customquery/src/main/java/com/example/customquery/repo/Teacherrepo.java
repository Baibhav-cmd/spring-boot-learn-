package com.example.customquery.repo;

import java.util.List;

import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.customquery.Teacher;

public interface Teacherrepo extends CrudRepository<Teacher, Integer> {

	public List<Teacher> findByName(String name);
	
	@NativeQuery("select * from Teacher where name Like 'a%'")
	public List<Teacher> getTeacher();
}
