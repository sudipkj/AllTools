package com.all.tools.handler;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Entity
public class EmployeeEntity {
    @Id
    private int empId;

    private String empName;
    private String empDept;
    private Long salary;
}
