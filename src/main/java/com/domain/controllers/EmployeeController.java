package com.domain.controllers;


import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.domain.models.entities.Employee;
import com.domain.services.EmployeeService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {
  
  @Autowired
  private EmployeeService employeeService;

  @RequestMapping(value = "/employees", method = RequestMethod.POST)
  public Employee create(@ModelAttribute @RequestBody Employee employee){
    return employeeService.save(employee);
  }

  @GetMapping("/employees")
  public Iterable<Employee> findAll(){
    return employeeService.findAll();
  }

  @GetMapping("/employees/{id}")
  public Employee findOne(@PathVariable("id") Long id){
    return employeeService.findOne(id);
  }

  @RequestMapping(value = "/employees/{id}", method = RequestMethod.PATCH)
  public Employee update(@ModelAttribute @RequestBody Employee employee){
    return employeeService.save(employee);
  }

  @DeleteMapping("/employees/{id}")
  public void removeOne(@PathVariable("id") Long id){
    employeeService.removeOne(id);
  }
}
