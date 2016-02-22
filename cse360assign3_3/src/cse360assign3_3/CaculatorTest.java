package cse360assign3_3;

import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

import cse360assign3_3.Calculator;

public class CaculatorTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	
	
	@Test
	public void testCalculator() {
		Calculator cal = new Calculator();
		assertNotNull(cal);
	}
	
	@Test
	public void testGetHistory()
	{
		Calculator cal =  new Calculator();

		cal.add(3);
		cal.multiply(4);
		cal.divide(5);
	
		cal.getHistory();
		
		assertTrue(("0\t+\t3\t*\t4\t/\t5").equals(cal.getHistory()));	//compare strings
	}
}
