package com.sta.jpamappings;

import com.sta.jpamappings.onetoone.entities.laptopstudent.Laptop;
import com.sta.jpamappings.onetoone.entities.laptopstudent.Student;
import com.sta.jpamappings.onetoone.repository.laptopstudent.LaptopRepository;
import com.sta.jpamappings.onetoone.repository.laptopstudent.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpamappingsApplication implements CommandLineRunner {

	@Autowired
	StudentRepository studentRepository;

	@Autowired
	LaptopRepository laptopRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpamappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Student student = new Student();
		student.setId(1);
		student.setName("Hari");
		student.setGender("Male");
		Laptop laptop = new Laptop();
		laptop.setId(1);
		laptop.setBrand("Mac");
		laptop.setModel("M1");
		student.setLaptop(laptop);
		laptop.setStudent(student);

		studentRepository.save(student);
		laptopRepository.save(laptop);


	}
}
