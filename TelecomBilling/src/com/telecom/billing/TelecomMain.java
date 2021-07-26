package com.telecom.billing;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;

public class TelecomMain {

	public static void main(String[] args) {

		// Current Date Format
		DateTimeFormatter date = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		// Current Time Format
		DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm:ss");

		LocalDateTime localDateTime = LocalDateTime.now();
		// current date
		String currentDate = date.format(localDateTime);
		// current time
		String currentTime = time.format(localDateTime);

		ArrayList<Plan> arrayList = new ArrayList<Plan>();
		arrayList.add(new Plan("0803456", currentDate, currentTime, 1200, "Incoming"));
		arrayList.add(new Plan("0123456", currentDate, currentTime, 5200, "Outgoing"));
		arrayList.add(new Plan("0123456", currentDate, currentTime, 4500, "Outgoing"));
		arrayList.add(new Plan("0123456", currentDate, currentTime, 3000, "Incoming"));
		arrayList.add(new Plan("0123456", currentDate, currentTime, 2889, "Incoming"));

		// Sorting
		Collections.sort(arrayList, new CustomComparator());

		// printing all the objects
		for (int i = 0; i <= arrayList.size() - 1; i++) {
			System.out.println(arrayList.get(i));
			BizPlan customers = new BizPlan(arrayList.get(i).getDuration());
			// printing the bill amount,units,duration
			System.out.println("Bill Amount:- " + customers.calculateAmount(arrayList.get(i).getTelephoneNo()) + " "
					+ "Units:- " + customers.getUnits() + " " + "Duration:- "
					+ formatSeconds(arrayList.get(i).getDuration()));
		}

	}

	// converting seconds into HH:MM:SS format
	public static String formatSeconds(int timeInSeconds) {
		int hr = (int) (timeInSeconds / 3600);
		int min = ((int) (timeInSeconds / 60)) % 60;
		int sec = (int) (timeInSeconds % 60);
		return hr + ":" + min + ":" + sec;
	}

}
