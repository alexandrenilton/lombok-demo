package com.abelem.domain;

import java.time.LocalDate;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonLombok {
	//@Id /*Em casos de Id, onde so usamos o getter, podemos setar para o setter ser private*/
	@Setter (value = AccessLevel.PRIVATE) 
	private Long Id;
	
	private String firstname;
	private String lastname;
	private String community;
	private LocalDate bornDate;
}
