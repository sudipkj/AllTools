package com.all.tools.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Employee {
    private int empId;
    private String empName;
    private String empDept;
    private Long salary;
}
