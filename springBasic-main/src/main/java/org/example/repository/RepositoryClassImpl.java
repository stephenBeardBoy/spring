package org.example.repository;

import org.example.model.Student;

import java.util.ArrayList;
import java.util.List;

public class RepositoryClassImpl implements StudentRepository {

    @Override
    public List<Student> findAll(){
        List<Student> students = new ArrayList<Student>();

        Student student = new Student();
        student.setName("Pradheep");
        student.setCourse("Java");

        students.add(student);

        return students;
    }
}
