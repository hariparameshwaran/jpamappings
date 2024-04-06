package com.sta.jpamappings.onetoone.entities.employee;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "jpa_employeeinfo")
@Data
public class EmployeeInfo {

    @Id
    public long employeeInfoId;

    public String street;

    public String city;

    public String state;

    public String postalCode;

    @OneToOne
    public Employee employee;


}
