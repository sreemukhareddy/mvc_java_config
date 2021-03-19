package com.luv2code.mvc.mvcdemo.vo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class Student {

	@NotBlank
	@Size(min = 3, message = "is required")
	private String firstName;
	@NotBlank
	@Size(min = 5, message = "is required")
	private String lastName;
	private String country;
	private String favoriteLanguage;
	
	@Min(value = 3)
	@Max(value = 10)
	private int freePasses;
	
	private List<String> operatingSystem = new ArrayList<>();

	private List<String> countryOptions = new ArrayList<>();

	public Student() {
		countryOptions.add("United Kingdom");
		countryOptions.add("France");
		countryOptions.add("India");
		countryOptions.add("Germany");
	}

}
