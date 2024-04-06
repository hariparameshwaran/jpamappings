package com.sta.jpamappings.onetoone.entities.laptopstudent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "jpa_laptop")
public class Laptop {

    @Id
    private long id;

    private String model;

    private String brand;

    @OneToOne
    private Student student;


}
