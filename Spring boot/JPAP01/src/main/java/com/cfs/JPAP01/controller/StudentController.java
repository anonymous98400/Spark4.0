package com.cfs.JPAP01.controller;

import com.cfs.JPAP01.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cfs.JPAP01.repo.StudentRepo;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private final StudentRepo studentrepo;
    public StudentController(StudentRepo studentrepo) {
        this.studentrepo = studentrepo;
    }

    @PostMapping
    public Student CreateStudent(@RequestBody Student student){
        return studentrepo.save(student);
    }

    @GetMapping
    public List<Student> getAllStudent(){
        return studentrepo.findAll();
    }

    @PutMapping
    public Student updateStudent(@RequestParam Long id, @RequestBody Student student){
        Student s= studentrepo.findById(id)
                .orElseThrow(()->new RuntimeException("Student not found"));
       s.setName(student.getName());
       s.setEmail(student.getEmail());
        return studentrepo.save(s);
    }

    @PatchMapping

    public Student partialUpdating(@RequestParam Long id,@RequestParam String name){
        Student s=studentrepo.findById(id).
                orElseThrow(()->new RuntimeException("Student not found"));
        s.setName(name);
        return s;

    }
}
