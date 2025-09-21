package com.example.crudjpa.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.crudjpa.Student;

public interface StudentRepo  extends CrudRepository<Student, Integer>{

}
