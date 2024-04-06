package com.sta.jpamappings.onetoone.entities.laptopstudent;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "jpa_student")
public class Student {
    @Id
    private long id;

    private String name;

    private String gender;

    @OneToOne(mappedBy = "student")
    private Laptop laptop;


}
