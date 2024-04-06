package com.sta.jpamappings.onetoone.entities.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "jpa_employee")
@Data
public class Employee {

    @Id
    public long employeeId;

    public String firstName;

    public String lastName;

    public String gender;

    public String email;

    @OneToOne(mappedBy = "employee")
    public EmployeeInfo employeeInfo;


}
