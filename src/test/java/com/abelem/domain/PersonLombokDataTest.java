package com.abelem.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class PersonLombokDataTest {
	@Test
	public void createPeople_withData_shouldReturnObject() {
		PersonLombok person = new PersonLombok();
		person.setFirstname("Alexandre");
		person.setLastname("Belem");
		person.setBornDate(LocalDate.now());
		person.setCommunity("GUJ");
//		person.setId(1L); //Error
//		person.getId(); // accessbible
		
		person.equals(new PersonLombok2());
		person.toString();
		
		assertNotNull(person);
		assertEquals(person.getFirstname(), "Alexandre");
	}
}
