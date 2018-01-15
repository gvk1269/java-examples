package com.health.quote.model;

public class Gender {

	private final String male;
	private final String female;
	
	
	public String getMale() {
		return male;
	}

	public String getFemale() {
		return female;
	}

	private Gender(GenderBuilder builder) {
		this.male= builder.male;
		this.female = builder.female;
	}
	
	public static class GenderBuilder{
		private String male;
		private String female;
		
		private enum GenderEnum{
			MALE,FEMALE;
		}
		public GenderBuilder male() {
			this.male = GenderEnum.MALE.name();
			return this;
		}
		
		public GenderBuilder female() {
			this.female = GenderEnum.FEMALE.name();
			return this;
		}
		
		public Gender gender() {
			return new Gender(this);
		}
		
		
	}
}
