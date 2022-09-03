package com.domain.models.repo;

import org.springframework.data.repository.CrudRepository;

import com.domain.models.entities.Employee;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

}
