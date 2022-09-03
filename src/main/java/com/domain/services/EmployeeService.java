package com.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.models.entities.Employee;
import com.domain.models.repo.EmployeeRepo;

@Service
public class EmployeeService {

  @Autowired
  private EmployeeRepo employeeRepo;

  public Employee save(Employee employee){
    return employeeRepo.save(employee);
  }

  public Employee findOne(Long id){
    return employeeRepo.findById(id).get();
  }

  public Iterable<Employee> findAll(){
    return employeeRepo.findAll();
  }

  public void removeOne(Long id){
    employeeRepo.deleteById(id);
  }
}
