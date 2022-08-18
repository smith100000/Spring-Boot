package com.prograd.Feignclient2;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/app2")
@RestController
public class StudentController {
    @PostMapping("/student/save")
    public  Student save(Student student){
        student.setFirstName("SuryaKumar");
        student.setLastName("Yadav");
        return student;
    }

}
