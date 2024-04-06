package com.sta.jpamappings.onetoone.repository.employeeemployeeinfo;

import com.sta.jpamappings.onetoone.entities.employee.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
