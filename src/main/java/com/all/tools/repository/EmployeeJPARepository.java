package com.all.tools.repository;

import com.all.tools.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeJPARepository extends JpaRepository<EmployeeEntity, Integer> {

}
