package com.sta.jpamappings.onetoone.repository.laptopstudent;

import com.sta.jpamappings.onetoone.entities.laptopstudent.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

}
