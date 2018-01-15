package com.health.quote.test;

import com.health.quote.model.Gender;
import com.health.quote.model.Habitts;
import com.health.quote.model.Health;
import com.health.quote.model.Name;
import com.health.quote.product.PremiumCost;

public class Test {

	public static void main(String[] args) {
		PremiumCost premiumCost =  new PremiumCost
				   .PremiumBuilder()
				   .name(new Name.NameBuilder()
							.firstName("Noman")
							.lastName("Gomes")
							.initials("Mr")	
							.name())
				   .gender(new Gender.GenderBuilder()
						   .male()
						   .gender())
				   .age(34)
				   .preConditions(new Health.HealthBuilder()
						   .haveHyperTension(false)
						   .haveBloodPessure(false)
						   .haveBooldSugar(false)
						   .haveOverwieght(true)
						   .preConditions())
				   .habbits(new Habitts.HabittsBuilder()
						   .youSmoke(false)
						   .youDrink(true)
						   .youExcersize(true)
						   .youDrugist(false)
						   .habitts())
				   .calculate();
		
		System.out.println(premiumCost);

	}

}
