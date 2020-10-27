package com.capg.pairing;

public class Ride {
	public double distance;
	public final int time;
	public CabRide cabRide;

	public Ride(CabRide cabRide, double distance, int time) {
		this.distance = distance;
		this.time = time;
		this.cabRide = cabRide;
	}
}
