package com.cfs.JPAP02.StudentController;

import com.cfs.JPAP02.Entity.Students;
import com.cfs.JPAP02.repo.StudentRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentRepo studentRepo;

    public StudentController(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    @GetMapping
    public List<Students>list(){
        return studentRepo.findAll();
    }

    @PostMapping()
    public Students createStudent(@RequestBody Students students){
        return studentRepo.save(students);
    }

    @PutMapping
    public Students updateStudent(@RequestParam Long id, @RequestBody Students students){
        Students s=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student is not found"));
        s.setName(students.getName());
        s.setLaptop(students.getLaptop());
        return studentRepo.save(s);
    }
    @PatchMapping
    public Students partialUpdate(@RequestParam Long id, @RequestParam String name){
        Students s=studentRepo.findById(id).orElseThrow(()->new RuntimeException("Student is not found"));
        s.setName(name);
        return studentRepo.save(s);
    }

}
