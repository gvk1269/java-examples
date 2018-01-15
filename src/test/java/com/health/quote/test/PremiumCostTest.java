package com.health.quote.test;

import static org.junit.Assert.assertSame;

import org.junit.Test;

import com.health.quote.model.Gender;
import com.health.quote.model.Habitts;
import com.health.quote.model.Health;
import com.health.quote.model.Name;
import com.health.quote.product.PremiumCost;

public class PremiumCostTest {

	@Test 
	public final void testAssertSamePremiumCost() {
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
		assertSame("Health Insurance for Mr Gomes is", 6856 , premiumCost.getPremium());
		
	}
	/*@Test
	public final void testGetName() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetAge() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetGender() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetHealth() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetHabitts() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testGetPremium() {
		fail("Not yet implemented"); // TODO
	}
*/
	

}
