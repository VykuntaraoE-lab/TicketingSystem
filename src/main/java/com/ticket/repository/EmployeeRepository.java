package com.ticket.repository;

import org.springframework.data.repository.CrudRepository;

import com.ticket.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
