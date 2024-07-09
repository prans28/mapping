package com.mapping.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Food {
	@Id
	private Integer foodId; 
	private String foodname; 
	private Double foodPrice;
	@ManyToMany(mappedBy = "foods" ,cascade = CascadeType.ALL)
	private List<Employee> employee;
	

}
