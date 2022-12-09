package ru.homework.hogwarts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.homework.hogwarts.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
