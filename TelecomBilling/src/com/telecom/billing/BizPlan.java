package com.telecom.billing;

public class BizPlan extends DefaultPlan {

	int usage, units;
	double amount;
	double unitCost = 0.75;
	int pulse = 60;
	int freeSeconds = 100;

	public BizPlan(int total_seconds) {
		super(total_seconds);
		//First 100 seconds free of cost, if needed 100 minutes modify free seconds to 6000 seconds
		if (total_seconds >= freeSeconds)
			usage = total_seconds - freeSeconds;
		else {
			usage = 0;
		}
	}

	@Override
	//calculating amount based on Std Code
	public double calculateAmount(String phoneNumber) {

		String stdcode = "";
		if (phoneNumber.length() > 3) {
			stdcode = phoneNumber.substring(0, 3);
		} else {
			stdcode = phoneNumber;
		}
		switch (stdcode) {
		case "080":
			pulse = 45;
			break;
		case "011":
			pulse = 10;
			break;
		case "022":
			pulse = 30;
			break;
		case "040":
			pulse = 40;
		default:
			pulse = 60;
		}
		units = Math.round(usage / pulse);
		return amount = units * unitCost;
	}
}
