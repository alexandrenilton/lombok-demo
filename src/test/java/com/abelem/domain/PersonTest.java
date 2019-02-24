package com.abelem.domain;

import java.time.LocalDate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PersonTest {
	
	@Test
	public void createPeople_withDefaultConstructor_shouldReturnObject() {
		Person person = new Person();
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
