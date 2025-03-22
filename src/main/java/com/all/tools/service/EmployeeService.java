package com.all.tools.service;

import com.all.tools.entity.EmployeeEntity;
import com.all.tools.repository.EmployeeJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeJPARepository employeeJPARepository;

    public List<EmployeeEntity> getEmployeeList(){
        return employeeJPARepository.findAll();
    }

    public EmployeeEntity addEmployee(EmployeeEntity employeeEntity){
        return employeeJPARepository.save(employeeEntity);
    }

}
