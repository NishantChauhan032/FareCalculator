package com.capg.pairing;

public class InvoiceGenerator {
	private static final int DISTANCE_RATE = 10;
	private static final int TIME_RATE = 1;
	private static final int MINIMUM_FARE = 5;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * DISTANCE_RATE + time * TIME_RATE;
		if (totalFare < MINIMUM_FARE)
			return MINIMUM_FARE;
		return totalFare;
	}
}
