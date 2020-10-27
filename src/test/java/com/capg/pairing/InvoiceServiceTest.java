package com.capg.pairing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class InvoiceServiceTest {
	Ride[] rides = null;
	InvoiceGenerator invoiceGenerator = null;
	InvoiceSummary invoiceSummary = null;
	RideRepository rideRepository = null;
	InvoiceSummary expectedInvoiceSummary = null;

	@Before
	public void setUp() throws Exception {
		invoiceGenerator = new InvoiceGenerator();
		rideRepository = new RideRepository();
		invoiceGenerator.setRideRepository(rideRepository);
		rides = new Ride[] {
				new Ride(CabRide.NORMAL, 4.0, 10), 
				new Ride(CabRide.PREMIUM, 0.1, 1)
		};
		expectedInvoiceSummary = new InvoiceSummary(2, 70);
	}

	@Test
	public void givenMultipleRides_ShouldReturnInvoiceSummary() {
		rides = new Ride[] { 
				new Ride(CabRide.NORMAL,4.0, 10), 
				new Ride(CabRide.NORMAL,0.1, 1) 
		};
		InvoiceSummary summary = invoiceGenerator.calculateFare(rides);
		InvoiceSummary expectedInvoiceSummary = new InvoiceSummary(2, 55);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}

	@Test
	public void givenUserIDAndRides_shouldReturnInvoiceSummary() {
		String userId = "pair@abc.com";
		invoiceGenerator.addRides(userId, rides);
		InvoiceSummary summary = invoiceGenerator.getInvoiceSummary(userId);
		Assert.assertEquals(expectedInvoiceSummary, summary);
	}
}
