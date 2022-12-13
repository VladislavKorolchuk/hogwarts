package ru.homework.hogwarts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.homework.hogwarts.model.Student;

import java.util.Collection;

public interface StudentRepository extends JpaRepository<Student, Long> {

    Collection<Student> findStudentByAgeIsBetween(int min,int max);
    Collection<Student> findStudentByAge(int age);

    Collection<Student> findStudentByFaculty_Id(long id);

}
