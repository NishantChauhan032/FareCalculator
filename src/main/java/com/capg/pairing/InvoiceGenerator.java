package com.capg.pairing;

public class InvoiceGenerator 
{
	private static final int DISTANCE_RATE = 10;
	private static final int TIME_RATE = 1;
	
	public double calculateFare(double distance, int time) {
		return distance*DISTANCE_RATE + time * TIME_RATE;
	}
}
