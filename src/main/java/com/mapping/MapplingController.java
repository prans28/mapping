package com.mapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mapping.entity.Address;
import com.mapping.entity.Employee;
import com.mapping.entity.Food;
import com.mapping.entity.Job;

@RestController
public class MapplingController {
	@GetMapping("/api")
	public ResponseEntity<Employee> m1() {
	    List<Job> jobs = new ArrayList<>();
	    jobs.add(Job.builder().jobid(1).jobLocation("Chennai").jobName("Software Developer").jobRole("Manager").build());
	    jobs.add(Job.builder().jobid(2).jobLocation("Mongolia").jobName("Operations Manager").jobRole("Trainer").build());

	    List<Food> foods = new ArrayList<>();
	    Food food1 = Food.builder().foodId(1).foodname("Idli").foodPrice(22.0).build();
	    
	    // Set employee for food1
	    //food1.setEmployee(List.of(Employee.builder().build())); // Assuming 'Pranav' is the employee's name

	    foods.add(food1);

	    List<Address> addresses = new ArrayList<>();
	    Address address1 = Address.builder()
	            .aId(1)
	            .aCity("Korba").aDno("22").aSreet("1st").aPincode("29299").aState("CG")
	            .build();
	    Address address2 = Address.builder()
	            .aId(2)
	            .aCity("CG").aDno("2s2").aSreet("a29").aPincode("939393").aState("Delhi")
	            .build();

	    Employee employee = Employee.builder()
	            .employeeId(1)
	            .employeeName("Pranav")
	            .employeeAge("22")
	            .employeeDob("2002-01-01")
	            .jobs(jobs)
	            .addresses(List.of(address1, address2))
	            .foods(foods)
	            .build();
	    food1.setEmployee(List.of(employee));
	    //foods.forEach(food -> food.setEmployee(List.of(employee)));


	    return ResponseEntity.ok(employee);
	}

}
