package org.example.service;

import org.example.model.Student;
import org.example.repository.RepositoryClassImpl;
import org.example.repository.StudentRepository;

import java.util.List;

public class ServiceClassImpl implements StudentService {

   //private StudentRepository repository = new RepositoryClassImpl();
   private StudentRepository repository;

    public ServiceClassImpl(StudentRepository repository) {
        this.repository = repository;
    }

    public void setRepository(StudentRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Student> findAll(){
       return repository.findAll();
    }
}
