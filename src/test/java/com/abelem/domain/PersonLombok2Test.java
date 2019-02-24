package com.abelem.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class PersonLombok2Test {
	@Test
	public void createPeople_withLombok_shouldReturnObject() {
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
	
	
	@Test
	public void usingConstructorWithNonNullArguments_shouldReturnObject() {
		PersonLombok2 pl2a = new PersonLombok2("Alexandre", "Belem" , "Spring Guru", LocalDate.now() );
		assertNotNull(pl2a);
	}
	
	@Test
	public void usingConstructorNoArguments_shouldReturnObject() {
		PersonLombok2 pl2b = new PersonLombok2();
		assertNotNull(pl2b);
	}
	
	@Test
	public void usingConstructorAllArguments_shouldReturnObject() {
		PersonLombok2 pl2c = new PersonLombok2(1L, "Alexandre", "Belem", "Spring Guru", LocalDate.now());
		assertNotNull(pl2c);
	}
}
