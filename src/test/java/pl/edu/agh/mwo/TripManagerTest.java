package pl.edu.agh.mwo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TripManagerTest 
{
	private static final Object Exception = null;
	@Test
	public void testMultiply() {
		TripManager tripManager = new TripManager ();
		
		assertEquals(16, TripManager.multiply(4, 4));

}
}
