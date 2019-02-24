package com.abelem.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;

import org.junit.Test;

public class PersonLombokBuilderTest {
	
	@Test
	public void createPeople_withLombok_withBuilder_shouldReturnObject() {
		PersonLombokBuilder person = PersonLombokBuilder
				.builder()
				.firstname("Alexandre")
				.lastname("Belem")
				.community("GUJ")
				.bornDate(LocalDate.now().toString())
				.build();
		
		
		assertNotNull(person);
		assertEquals(person.getFirstname(), "Alexandre");
	}
}
