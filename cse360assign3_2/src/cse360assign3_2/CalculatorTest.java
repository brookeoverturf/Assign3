/*
 * Author: Brooke Overturf
 * PIN: 622
 */
package cse360assign3_2;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		assertNotNull(cal);
	}

	
	@Test
	public void testGetTotal()
	{
		Calculator cal = new Calculator();

		assertEquals(0, cal.getTotal());
	}
	

	@Test
	public void testAdd()
	{
		Calculator cal =  new Calculator();
	
		cal.add(3);
		
		assertEquals(3, cal.getTotal());	//check if total is now 3
	}
	

	@Test
	public void testSubtract()
	{
		Calculator cal =  new Calculator();
		
		cal.add(3);
		cal.subtract(1);
		
		assertEquals(2,cal.getTotal());	//total should be 2
	}
	

	@Test
	public void testMultiply()
	{
		Calculator cal =  new Calculator();

		cal.add(2);
		cal.multiply(2);
		
		assertEquals(4,cal.getTotal());		//total should be 4 = 2*2
	}
	

	@Test
	public void testDivide()
	{
		Calculator cal =  new Calculator();

		cal.divide(0);
		
		assertEquals(0,cal.getTotal());		//total should be 0 since parameter is 0
	}
	

	@Test
	public void testGetHistory()
	{
		Calculator cal =  new Calculator();
		try{
			cal.getHistory();
		}
		catch(Exception e){
			fail("Not yet implemented");	//default fail assert 
		}
	}
	
}
