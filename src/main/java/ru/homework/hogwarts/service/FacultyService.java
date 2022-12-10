package ru.homework.hogwarts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.homework.hogwarts.model.Faculty;
import ru.homework.hogwarts.repository.FacultyRepository;

import java.util.Collection;
import java.util.stream.Collectors;


@Service
public class FacultyService {

    FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFaculty(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFaculty(Long id) {
        facultyRepository.deleteById(id);
    }

    public Faculty updateFaculty(Long id, Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty searchFaculty(Long id) {
        return facultyRepository.findById(id).get();
    }

    public Collection<Faculty> getAllFacultys() {
        return facultyRepository.findAll();
    }

    public Collection<Faculty> getFacultyByColor(String color) {
        return this.facultyRepository.findByColor(color);
    }

    public Collection<Faculty> getFacultyByName(String name) {
        return this.facultyRepository.findByName(name);
    }

}
