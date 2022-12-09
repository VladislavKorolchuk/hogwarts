package ru.homework.hogwarts.controller;

import org.springframework.web.bind.annotation.*;
import ru.homework.hogwarts.model.Student;
import ru.homework.hogwarts.service.StudentService;
import java.util.Collection;

@RestController
@RequestMapping("/student")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return this.studentService.createStudent(student);
    }

    @DeleteMapping({"/{id}"})
    public void deleteStudent(@PathVariable("id") Long id) {
        this.studentService.deleteStudent(id);
    }

    @PutMapping({"/{id}"})
    public Student searchStudent(@PathVariable("id") Long id, @RequestBody Student student) {
        return this.studentService.updateStudent(id, student);
    }

    @GetMapping({"/{id}"})
    public Student searchStudent(@PathVariable("id") Long id) {
        return this.studentService.searchStudent(id);
    }

    @GetMapping
    public Collection<Student> getAllStudent() {
        return this.studentService.getAllStudents();
    }

    @GetMapping("/age/{age}")
    public Collection<Student> getStudentsByAge(@PathVariable("age") Integer age) {
        return this.studentService.getStudentsByAge(age);
    }

}
