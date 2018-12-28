package com.cs.DependencyCheck;

public class Parent {

	String firstName;
	String lastName;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return firstName + lastName;
	}
	
	
}
