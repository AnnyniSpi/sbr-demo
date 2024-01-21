package dev.annynispi.sbrdemo.controllers;

import dev.annynispi.sbrdemo.entity.Student;
import dev.annynispi.sbrdemo.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class StudentController {

    private final StudentService service;

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudent(){
        return new ResponseEntity<>(service.getAllStudents(), HttpStatus.FOUND);
    }

    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        return new ResponseEntity<>(service.addStudent(student), HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Student> updateStudent(@RequestBody Student student, @PathVariable Long id){
        return new ResponseEntity<>(service.updateStudent(student, id), HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public void deleteStudent(@PathVariable Long id){
        service.deleteStudentById(id);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id){
        return new ResponseEntity<>(service.getStudentById(id), HttpStatus.OK);
    }

}
