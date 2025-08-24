package org.cfs.BootP02.Controller;

import org.cfs.BootP02.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @Autowired
    StudentService service;
    @GetMapping("/welcome")
    public String dataFetchFromDb(){
        return service.getStudentDate();
    }
}
