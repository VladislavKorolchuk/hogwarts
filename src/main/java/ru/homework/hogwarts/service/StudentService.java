package ru.homework.hogwarts.service;


import org.springframework.stereotype.Service;
import ru.homework.hogwarts.model.Student;
import ru.homework.hogwarts.repository.StudentRepository;

import java.util.Collection;
import java.util.stream.Collectors;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Student updateStudent(Long id, Student student) {
        return studentRepository.save(student);
    }

    public Student searchStudent(Long id) {
        return studentRepository.findById(id).get();
    }

    public Collection<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Collection<Student> getStudentsByAge(int age) {
        Collection<Student> students;
        students = studentRepository.findAll().stream().
                filter(a -> a.getAge() == age).
                collect(Collectors.toList());
        return students;
    }

}