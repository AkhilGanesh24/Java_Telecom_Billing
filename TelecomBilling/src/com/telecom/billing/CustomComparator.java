package com.telecom.billing;

import java.util.Comparator;

public class CustomComparator implements Comparator<Plan> {

	@Override
	public int compare(Plan o1, Plan o2) {
		
		return o2.getFlag().compareTo(o1.getFlag());
				}

}
