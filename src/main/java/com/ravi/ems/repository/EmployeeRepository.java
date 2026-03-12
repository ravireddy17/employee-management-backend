package com.ravi.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ravi.ems.entity.Employee;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByEmail(String email);
}