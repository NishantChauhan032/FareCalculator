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
}
