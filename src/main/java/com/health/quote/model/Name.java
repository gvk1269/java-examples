package com.health.quote.model;

public class Name {

	private final String firstName;
	private final String lastName;
	private final String initials;
	
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getInitials() {
		return initials;
	}
	
	private Name(NameBuilder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.initials = builder.initials;
	}
	
	public static class NameBuilder{
		private String firstName;
		private String lastName;
		private String initials;
		
		
		public NameBuilder firstName(String name) {
			this.firstName = name;
			return this;
		}
		
		public NameBuilder lastName(String name) {
			this.lastName = name;
			return this;
		}
		public NameBuilder initials(String initials) {
			this.initials = initials;
			return this;
		}
		
		public Name name() {
			return new Name(this);
		}
	}
	
	public String toString() {
		return this.initials+" "+lastName;
	}
	
}
