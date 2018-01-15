package com.health.quote.model;

import com.health.quote.service.Pecentage;

public class Health {

	private final boolean hyperTension;
	private final boolean bloodSugar;
	private final boolean bloodPressure;
	private final boolean overweight;
	private final double premium;
	
	
	
	public boolean isHyperTension() {
		return hyperTension;
	}

	public boolean isBloodSugar() {
		return bloodSugar;
	}

	public boolean isBloodPressure() {
		return bloodPressure;
	}

	public boolean isOverweight() {
		return overweight;
	}

	public double getPremium() {
		return premium;
	}

	private Health(HealthBuilder builder) {
		this.hyperTension = builder.hyperTension;
		this.bloodPressure = builder.bloodPressure;
		this.bloodSugar = builder.bloodSugar;
		this.overweight = builder.overweight;
		this.premium = builder.premium;
	}
	
	public static class HealthBuilder{
		private  boolean hyperTension;
		private  boolean bloodSugar;
		private  boolean bloodPressure;
		private  boolean overweight;
		private double premium;
		
		public HealthBuilder haveHyperTension(boolean hypertense) {
			this.hyperTension = hypertense;
			if(hyperTension) {
				premium += Pecentage.basePremium * 0.01;
			}
			return this;
		}
		
		public HealthBuilder haveBooldSugar(boolean sugar) {
			this.bloodSugar = sugar;
			if(bloodSugar) {
				premium += Pecentage.basePremium * 0.01;
			}
			return this;
		}
		
		public HealthBuilder haveBloodPessure(boolean pressure) {
			this.bloodPressure = pressure;
			if(bloodPressure) {
				premium += Pecentage.basePremium * 0.01;
			}
			return this;
		}
		
		public HealthBuilder haveOverwieght(boolean weight) {
			this.overweight = weight;
			if(overweight) {
				premium += Pecentage.basePremium * 0.01;
			}
			return this;
		}
		
		public Health preConditions() {
			return new Health(this);
		}
		
	}
}
