package com.health.quote.service;

import com.health.quote.model.Gender;
import com.health.quote.model.Habitts;
import com.health.quote.model.Health;

public interface Pecentage {

	public double basePremium = 5000;
	default double applyAgePercentage( int age ,double totalPremium) {
		System.out.println("applyAgePercentage Enter: "+ totalPremium);
		// Increase premium depending on age
		if(age <=18) {
			totalPremium = totalPremium + (totalPremium * 0 );
			System.out.println(" 0 to 18 : age: "+ age +" premium :"+ totalPremium);
		}else if (age >= 18 && age <= 25) {
			totalPremium = totalPremium + (totalPremium * 0.10 );
			System.out.println(" 18 to 25 : age: "+ age +" premium :"+ totalPremium);
		} else if (age >= 25 && age <= 30) {
			totalPremium = totalPremium + (totalPremium * 0.10 );
			System.out.println(" 25 to 30 :  age "+ age +" premium :"+  totalPremium);
		} else if (age >= 30 && age <= 35) {
			totalPremium = totalPremium + (totalPremium * 0.10 );
			System.out.println(" 30 to 35 :age "+ age +" premium :"+  totalPremium);
		} else if (age >= 35 && age <= 40) {
			totalPremium = totalPremium + (totalPremium * 0.10 );
			System.out.println(" 35 to 40 :age "+ age +" premium :"+  totalPremium);
		} else if (age >= 40) {
			int ageCalc = age - 40;
			while (ageCalc >= 5) {
				totalPremium = totalPremium + (totalPremium * 0.20 );
				System.out.println(" 35 to 40 : age "+ age +" premium :"+totalPremium);
				ageCalc -= 5;
			}
		}
		System.out.println("applyAgePercentage Exit: "+ totalPremium);
		return totalPremium;
	}
	
	default double applyGenderPercentage(Gender gender , double genderPremium) {
		System.out.println("applyGenderPercentage Enter: "+ genderPremium);
		// Increase premium depending on gender
		
		if( null != gender.getMale() && "MALE".equalsIgnoreCase(gender.getMale())) {
			genderPremium = genderPremium + (genderPremium * 0.02) ;
			System.out.println("applyGenderPercentage Exit: "+ genderPremium);
		}
		
		return genderPremium;
	}
	
	default double applyHabittsPercentage(Habitts habitt,double totalPremium) {
		System.out.println("applyHabittsPercentage : Enter "+ totalPremium);
		if(habitt.isDrink()) {
			totalPremium  = totalPremium +  (totalPremium * 0.03);
			System.out.println("applyHabittsPercentage : isDrink() "+ totalPremium);
		}
		
		if(habitt.isDrugs()) {
			totalPremium  = totalPremium +  (totalPremium * 0.03);
			System.out.println("applyHabittsPercentage : isDrugs() "+ totalPremium);
		}
		
		if(habitt.isExcersize()) {
			totalPremium  = totalPremium - (totalPremium * 0.03);
			System.out.println("applyHabittsPercentage :isExcersize() "+ totalPremium);
		}
		
		if(habitt.isSmoke()) {
			totalPremium  = totalPremium +  (totalPremium * 0.03);
			System.out.println("applyHabittsPercentage : isSmoke() "+ totalPremium);
		}
		
		System.out.println("applyHabittsPercentage : Exit "+ totalPremium);
		return totalPremium;
	}
	
	default double applyPreConditionsPercentage(Health health,double totalPremium) {
		System.out.println("applyPreConditionsPercentage : Enter "+ totalPremium);
		if(health.isBloodPressure()) {
			totalPremium  = totalPremium +  (totalPremium * 0.01);
			System.out.println("applyPreConditionsPercentage : isBloodPressure() "+ totalPremium);
		}
		
		if(health.isBloodSugar()) {
			totalPremium =totalPremium +  (totalPremium * 0.01);
			System.out.println("applyPreConditionsPercentage : isBloodSugar() "+ totalPremium);
		}
		
		if(health.isHyperTension()) {
			totalPremium =totalPremium +  (totalPremium * 0.01);
			System.out.println("applyPreConditionsPercentage : isHyperTension() "+ totalPremium);
		}
		
		if(health.isOverweight()) {
			totalPremium =totalPremium +  (totalPremium * 0.01);
			System.out.println("applyPreConditionsPercentage : isOverweight() "+ totalPremium);
		}
		System.out.println("applyPreConditionsPercentage : Exit "+ totalPremium);
		return totalPremium;
	}
	
}
