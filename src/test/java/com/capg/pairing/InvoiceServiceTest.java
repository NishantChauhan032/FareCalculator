package com.capg.pairing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
	InvoiceGenerator invoiceGenerator = null;

	@Before
	public void setUp() throws Exception {
		invoiceGenerator = new InvoiceGenerator();
	}

	@Test
	public void givenDistanceAndTime_whenCalculated_shouldReturnTotalFare() {
		double distance = 4.0;
		int time = 10;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(50, fare, 0.0);
	}

	@Test
	public void givenDistanceAndTime_whenFareLessThanMinFare_shouldReturnMinimumFare() {
		double distance = 0.1;
		int time = 1;
		double fare = invoiceGenerator.calculateFare(distance, time);
		Assert.assertEquals(5, fare, 0.0);
	}

	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		Ride[] rides = { 
						new Ride(4.0, 10), 
						new Ride(0.1, 1) 
					};
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 55);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}
}
