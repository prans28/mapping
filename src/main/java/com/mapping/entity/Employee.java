package com.mapping.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Employee {
	@Id
	private Integer employeeId;
	private String employeeName;
	private String employeeAge;
	private String employeeDob;
	@OneToMany
	private List<Address> addresses;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Job> jobs;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Food> foods;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Car> car;

	@OneToOne(cascade = CascadeType.ALL)
	private Father father;
}
