package com.abelem.domain;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
	private String firstname;
	private String lastname;
	private String community;
	private LocalDate bornDate;
		
	
	public Person() { }

	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", community=" + community + ", bornDate="
				+ bornDate + "]";
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(firstname, lastname, bornDate);
	}
	
	@Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstname, person.firstname) &&
                Objects.equals(lastname, person.lastname) &&
                Objects.equals(bornDate, person.bornDate);
    }

	public Person(String firstname, String lastname) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public Person(String firstname, String lastname, String community, LocalDate bornDate) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.community = community;
		this.bornDate = bornDate;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCommunity() {
		return community;
	}
	public void setCommunity(String community) {
		this.community = community;
	}
	public LocalDate getBornDate() {
		return bornDate;
	}
	public void setBornDate(LocalDate bornDate) {
		this.bornDate = bornDate;
	}

	
}
