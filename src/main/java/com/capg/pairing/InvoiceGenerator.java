package com.capg.pairing;

public class InvoiceGenerator {
	private static final int DISTANCE_RATE = 10;
	private static final int TIME_RATE = 1;
	private static final int MINIMUM_FARE = 5;

	public double calculateFare(double distance, int time) {
		double totalFare = distance * DISTANCE_RATE + time * TIME_RATE;
		return Math.max(totalFare, MINIMUM_FARE);
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;

		for (Ride ride : rides) {
			totalFare += this.calculateFare(ride.distance, ride.time);
		}
		return new InvoiceSummary(rides.length,totalFare);
	}

	public void addRides(String userId, Ride[] rides) {
		
	}

	public InvoiceSummary getInvoiceSummary(Ride[] rides) {
		return null;
	}
}
