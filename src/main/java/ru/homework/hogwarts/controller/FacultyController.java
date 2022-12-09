package ru.homework.hogwarts.controller;

import org.springframework.web.bind.annotation.*;
import ru.homework.hogwarts.model.Faculty;
import ru.homework.hogwarts.service.FacultyService;

import java.util.Collection;

@RestController
@RequestMapping("/faculty")
public class FacultyController {

    FacultyService facultyService;

    public FacultyController(FacultyService facultyService) {
        this.facultyService = facultyService;
    }

    @PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return this.facultyService.createFaculty(faculty);
    }

    @DeleteMapping({"/{id}"})
    public void deleteFaculty(@PathVariable("id") Long id) {
        this.facultyService.deleteFaculty(id);
    }

    @PutMapping({"/{id}"})
    public Faculty searchFaculty(@PathVariable("id") Long id, @RequestBody Faculty faculty) {
        return this.facultyService.updateFaculty(id, faculty);
    }

    @GetMapping({"/{id}"})
    public Faculty searchFaculty(@PathVariable("id") Long id) {
        return this.facultyService.searchFaculty(id);
    }

    @GetMapping
    public Collection<Faculty> getAllFaculty() {
        return this.facultyService.getAllFacultys();
    }

}
