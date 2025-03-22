package com.all.tools.repository;

import com.all.tools.handler.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeJPARepository extends JpaRepository<EmployeeEntity, Integer> {

}
