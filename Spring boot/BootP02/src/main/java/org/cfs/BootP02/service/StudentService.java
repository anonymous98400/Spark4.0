package org.cfs.BootP02.service;

import org.cfs.BootP02.repository.Studentrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
        @Autowired
            Studentrepo repo;
        public String getStudentDate(){
                return repo.getStudentData();
        }
}
