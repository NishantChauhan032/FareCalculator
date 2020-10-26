package com.capg.pairing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideRepository {

	private Map<String, List<Ride>> rideRepository;

	public RideRepository() {
		rideRepository = new HashMap<String, List<Ride>>();
	}

	public void addRides(String userId, Ride[] rides) {
		rideRepository.put(userId, Arrays.asList(rides));
	}

	public Ride[] getRides(String userId) {
		Ride[] rides = rideRepository.get(userId).toArray(new Ride[0]);
		return rides;
	}
}
