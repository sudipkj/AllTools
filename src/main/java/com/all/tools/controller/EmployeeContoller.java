package com.all.tools.controller;

import com.all.tools.handler.EmployeeEntity;
import com.all.tools.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/restcontroller")
public class EmployeeContoller {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<EmployeeEntity> getAllEmployee(){
        return employeeService.getEmployeeList();
    }
}
