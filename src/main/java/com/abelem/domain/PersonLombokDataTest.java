package com.abelem.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

@Data
public class PersonLombokDataTest {
	@Setter (value = AccessLevel.PRIVATE) 
	private Long id;
	private String firstname;
	private String lastname;
	private String bornDate;
	private String community;
}
