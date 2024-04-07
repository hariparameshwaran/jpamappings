package com.sta.jpamappings;

import com.sta.jpamappings.onetoone.entities.employee.Employee;
import com.sta.jpamappings.onetoone.entities.employee.EmployeeInfo;
import com.sta.jpamappings.onetoone.entities.laptopstudent.Laptop;
import com.sta.jpamappings.onetoone.entities.laptopstudent.Student;
import com.sta.jpamappings.onetoone.repository.employeeemployeeinfo.EmployeeInfoRepository;
import com.sta.jpamappings.onetoone.repository.employeeemployeeinfo.EmployeeRepository;
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

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	EmployeeInfoRepository employeeInfoRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpamappingsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		/*Student student = new Student();
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
		laptopRepository.save(laptop);*/

		Employee employee = new Employee();
		employee.setEmployeeId(1001);
		employee.setFirstName("Harri");
		employee.setLastName("Param");
		employee.setEmail("abc@gmail.com");
		employee.setGender("Male");


		EmployeeInfo employeeInfo = new EmployeeInfo();
		employeeInfo.setEmployeeInfoId(10000001);
		employeeInfo.setStreet("RPR");
		employeeInfo.setCity("Bangalore");
		employeeInfo.setPostalCode("560062");
		employeeInfo.setState("Karnataka");
		employee.setEmployeeInfo(employeeInfo);
		employeeInfo.setEmployee(employee);
		employeeRepository.save(employee);
		employeeInfoRepository.save(employeeInfo);







	}
}
