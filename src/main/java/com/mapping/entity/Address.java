package com.mapping.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

public class Address {
	@Id
	private Integer aId;
	private String aDno;
	private String aSreet;
	private String aCity;
	private String aState;
	private String aPincode;
}