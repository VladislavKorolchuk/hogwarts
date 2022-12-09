package ru.homework.hogwarts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.homework.hogwarts.model.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {
}
