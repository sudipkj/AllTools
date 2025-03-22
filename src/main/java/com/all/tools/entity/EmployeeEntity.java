package com.all.tools.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class EmployeeEntity {
    @Id
    private int empId;

    private String empName;
    private String empDept;
    private Long salary;
}
