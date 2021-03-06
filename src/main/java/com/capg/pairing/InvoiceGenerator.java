package com.capg.pairing;

public class InvoiceGenerator {

	private RideRepository rideRepository = null;

	public void setRideRepository(RideRepository rideRepository) {
		this.rideRepository = rideRepository;
	}

	public InvoiceSummary calculateFare(Ride[] rides) {
		double totalFare = 0;

		for (Ride ride : rides) {
			totalFare += ride.cabRide.calculateFare(ride);
		}
		return new InvoiceSummary(rides.length, totalFare);
	}

	public void addRides(String userId, Ride[] rides) {
		rideRepository.addRides(userId, rides);
	}

	public InvoiceSummary getInvoiceSummary(String userId) {
		return this.calculateFare(rideRepository.getRides(userId));
	}
}
