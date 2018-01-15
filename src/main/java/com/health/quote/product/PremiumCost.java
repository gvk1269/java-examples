package com.health.quote.product;

import com.health.quote.model.Gender;
import com.health.quote.model.Habitts;
import com.health.quote.model.Health;
import com.health.quote.model.Name;
import com.health.quote.service.Pecentage;

public class PremiumCost {

	private final Name name;
	private final int age;
	private final Gender gender;
	private final Health health;
	private final Habitts habitts;
	private double premium ;
	
	private PremiumCost(PremiumBuilder builder) {
		this.name= builder.name;
		this.age = builder.age;
		this.gender= builder.gender;
		this.health = builder.health;
		this.habitts =builder.habitts;
		this.premium = builder.premium;
	}
	
	
	public Name getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Gender getGender() {
		return gender;
	}

	public Health getHealth() {
		return health;
	}

	public Habitts getHabitts() {
		return habitts;
	}

	public double getPremium() {
		return premium;
	}


	public static class PremiumBuilder implements Pecentage{
		private Name name;
		private int age;
		private Gender gender;
		private Health health;
		private Habitts habitts;
		private double premium;
		
		public PremiumBuilder name(Name name) {
			this.name = name;
			return this;
		}
		
		public PremiumBuilder age(int age) {
			this.age = age;
			return this;
		}
		
		public PremiumBuilder gender(Gender gender) {
			this.gender = gender;
			return this;
		}
		
		public PremiumBuilder preConditions(Health health) {
			this.health = health;
			return this;
		}
		
		public PremiumBuilder habbits(Habitts habitts) {
			this.habitts = habitts;
			return this;
		}
		
		public PremiumCost calculate() {
			
			System.out.println("Intial Health Insurance "+ premium);
			premium = Pecentage.basePremium;
			//Age
			premium = applyAgePercentage(this.age,premium);
			
			//Gender
			if(this.gender !=null) {
				premium = applyGenderPercentage(this.gender,premium);
			}
			
			//health
			if(this.health !=null) {
				premium = applyPreConditionsPercentage(this.health, premium);
			}
			
			//Habitts
			if(this.habitts !=null) {
				premium = applyHabittsPercentage(this.habitts, premium);
			}
			System.out.println("Total Insurance premium "+ premium);
			return new PremiumCost(this);
		}
	}
	
	public String toString() {
		return "Health Insurance for "+this.name.toString()+ " is " + getPremium();
	}
}
