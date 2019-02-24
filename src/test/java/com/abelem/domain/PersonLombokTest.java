package com.abelem.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class PersonLombokTest {
	@Test
	public void createPeople_withLombok_shouldReturnObject() {
		PersonLombok person = new PersonLombok();
		person.setFirstname("Alexandre");
		person.setLastname("Belem");
		person.setBornDate(LocalDate.now());
		person.setCommunity("GUJ");
		
		person.equals(new Person());
		person.toString();
		
		assertNotNull(person);
		assertEquals(person.getFirstname(), "Alexandre");
	}
}
