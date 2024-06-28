package org.jsp.Controller;


import java.util.Optional;

import org.jsp.dto.Employee;
import org.jsp.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
@Autowired
	private EmployeeService service;
@PostMapping
 public Employee saveEmployee(@RequestBody Employee employee)
 {
	 return service.saveEmployee(employee);
 }
@GetMapping("/{id}")
public Optional<Employee> findById(@PathVariable(name="id")int id)
{
	return service.findbyId(id);
}
@DeleteMapping("/{id}")
public Optional<Employee> deleteById(@PathVariable(name="id") int id)
{
	return service.deleteById(id);
}
@PutMapping
public Employee updateEmployee(@RequestBody Employee employee)
{
	return service.updateEmployee(employee);
}
}
