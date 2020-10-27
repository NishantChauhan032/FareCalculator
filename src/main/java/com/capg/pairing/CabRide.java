package com.capg.pairing;

public enum CabRide {
	NORMAL(10, 1, 5), PREMIUM(15, 2, 20);

	private final double DISTANCE_RATE;
	private final double TIME_RATE;
	private final double MINIMUM_FARE;

	CabRide(double DISTANCE_RATE, double TIME_RATE, double MINIMUM_FARE) {
		this.DISTANCE_RATE = DISTANCE_RATE;
		this.TIME_RATE = TIME_RATE;
		this.MINIMUM_FARE = MINIMUM_FARE;
	}

	public double calculateFare(Ride ride) {
		double rideCost = ride.distance * DISTANCE_RATE + ride.time * TIME_RATE;
		return Math.max(rideCost, MINIMUM_FARE);
	}
}
