package com.cs.DependencyCheck;

public class Child {

	Parent parent;
	String firstName;
	String lastName;
	
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
		System.out.println(toString());
	}
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
	}
	
	@Override
	public String toString() {
		return firstName + parent.firstName + lastName;
	}

}
