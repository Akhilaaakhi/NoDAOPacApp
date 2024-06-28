package org.jsp.service;

import java.util.Optional;

import org.jsp.dto.Employee;
import org.jsp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository repository;
	
public Employee saveEmployee(Employee employee)
{
 return	repository.save(employee);
}
public Optional<Employee> findbyId(int id)
{
Optional<Employee> reemploy= repository.findById(id);
if(reemploy.isPresent())
{
	Optional<Employee> employee=Optional.of(reemploy.get());
	return employee;
}
return null;
}
public Optional<Employee> deleteById(int id)
{
	Optional<Employee> reemploy=repository.findById(id);
	if(reemploy.isPresent())
	{
		repository.deleteById(id);
}	return null;
}
public Employee updateEmployee(Employee employee)
{
	Optional<Employee> reemploy=repository.findById(employee.getId());
	if(reemploy.isPresent())
	{
	  Employee e=reemploy.get();
	  e.setId(employee.getId());
	  e.setName(employee.getEmail());
	  e.setEmail(employee.getEmail());
	  e.setPassword(employee.getPassword());
	 Employee emp= repository.save(e);
	 return emp;
	}
	return null;
}
}
