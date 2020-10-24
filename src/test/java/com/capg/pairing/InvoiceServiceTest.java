package com.capg.pairing;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
	@Test
	public void givenDistanceAndTime_whenCalculated_shouldReturnTotalFare() {
		InvoiceGenerator fareCalculator = new InvoiceGenerator();
		double distance = 4.0;
		int time = 10;
		double fare = fareCalculator.calculateFare(distance, time);
		Assert.assertEquals(50, fare, 0.0);
	}
	
	@Test
	public void givenDistanceAndTime_whenFareLessThanMinFare_shouldReturnMinimumFare() {
		InvoiceGenerator fareCalculator = new InvoiceGenerator();
		double distance = 0.1;
		int time = 1;
		double fare = fareCalculator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}
}
