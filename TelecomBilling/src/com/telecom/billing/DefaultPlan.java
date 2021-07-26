package com.telecom.billing;

public class DefaultPlan {

	int discountedUsage, units;
	double amount;
	double unitCost = 0.75;
	int normalUsage;
	int pulse = 60;// By default every 60 secs is one unit
	
	

	public DefaultPlan(int total_seconds) {
		discountedUsage = total_seconds-1000;
		normalUsage= total_seconds;
	}

	public int getUnits() {
		units = Math.round(normalUsage/ pulse);
		return units;
	}

	public double getAmount() {
		return amount;
	}

	public void calculateUnits() {
		units = Math.round(discountedUsage / pulse);
	}
	
	public double calculateAmount(String phoneNumber) {
		
		units = Math.round(discountedUsage / pulse);
		return amount = units * unitCost;
	}
	
	
}
