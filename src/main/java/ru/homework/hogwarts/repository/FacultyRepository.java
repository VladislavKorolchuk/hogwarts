package ru.homework.hogwarts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.homework.hogwarts.model.Faculty;
import ru.homework.hogwarts.model.Student;

import java.util.Collection;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

    Collection<Faculty> findByColor(String color);
    Collection<Faculty> findByName (String name);

}
