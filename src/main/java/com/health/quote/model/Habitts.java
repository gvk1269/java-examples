package com.health.quote.model;

import com.health.quote.service.Pecentage;

public class Habitts {

	private final boolean smoke;
	private final boolean drink;
	private final boolean excersize;
	private final boolean drugs;
	private double premium;
	
	
	public boolean isSmoke() {
		return smoke;
	}
	public boolean isDrink() {
		return drink;
	}
	public boolean isExcersize() {
		return excersize;
	}
	public boolean isDrugs() {
		return drugs;
	}
	public double getPremium() {
		return premium;
	}
	private Habitts(HabittsBuilder builder) {
		this.smoke = builder.smoke;
		this.drink = builder.drink;
		this.excersize = builder.excersize;
		this.drugs = builder.drugs;
		this.premium = builder.premium;
	}
	public static class HabittsBuilder{
		private boolean smoke;
		private boolean drink;
		private boolean excersize;
		private boolean drugs;
		private double premium;
		
		
		public double getPremium() {
			return premium;
		}
		public HabittsBuilder youSmoke(boolean smoke) {
			this.smoke = smoke;
			if(smoke) {
				premium += Pecentage.basePremium * 0.03;
			}
			return this;
		}
		public HabittsBuilder youDrink(boolean drink) {
			this.drink = drink;
			if(drink) {
				premium += Pecentage.basePremium * 0.03;
			}
			return this;
		}
		
		public HabittsBuilder youExcersize(boolean excersize) {
			this.excersize = excersize;
			if(excersize) {
				premium -= Pecentage.basePremium * 0.03;
			}
			return this;
		}
		public HabittsBuilder youDrugist(boolean drugs) {
			this.drugs = drugs;
			if(drugs) {
				premium += Pecentage.basePremium * 0.03;
			}
			return this;
		}
		
		public Habitts habitts() {
			return new Habitts(this);
		}
		
	}
	
}
