package com.all.tools.controller;

import com.all.tools.entity.EmployeeEntity;
import com.all.tools.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/addEmployee")
    public EmployeeEntity addEmployee(@RequestBody EmployeeEntity employeeEntity){
        return employeeService.addEmployee(employeeEntity);
    }
}
