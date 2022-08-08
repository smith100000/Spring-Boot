package com.prograd.EmpolyeeTask1.controller;

import com.prograd.EmpolyeeTask1.EmployeeTask1;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Employee{


    @GetMapping("/employee")
    public EmployeeTask1 employeeDetails(@RequestParam("name") String EmpName,@RequestParam("age") int EmpAge,@RequestParam("id") int EmpId){
        return new EmployeeTask1(EmpName,EmpAge,EmpId);

    }
}
