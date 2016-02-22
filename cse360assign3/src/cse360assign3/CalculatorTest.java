/*
 * Author: Brooke Overturf
 * PIN: 622
 */
package cse360assign3;

import static org.junit.Assert.*;

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
		Calculator cal =  new Calculator();
		try{
			cal.getTotal();
		}
		catch(Exception e){
			fail("Not yet implemented");	//default fail assert
		}
	}
	

	@Test
	public void testAdd()
	{
		Calculator cal =  new Calculator();
		try{
			cal.add(0);
		}
		catch(Exception e){
			fail("Not yet implemented");	//default fail assert 
		}
	}
	

	@Test
	public void testSubtract()
	{
		Calculator cal =  new Calculator();
		try{
			cal.subtract(2);
		}
		catch(Exception e){
			fail("Not yet implemented");	//default fail assert 
		}
	}
	

	@Test
	public void testMultiply()
	{
		Calculator cal =  new Calculator();
		try{
			cal.multiply(5);
		}
		catch(Exception e){
			fail("Not yet implemented");	//default fail assert 
		}
	}
	

	@Test
	public void testDivide()
	{
		Calculator cal =  new Calculator();
		try{
			cal.divide(0);
		}
		catch(Exception e){
			fail("Not yet implemented");	//default fail assert 
		}
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
