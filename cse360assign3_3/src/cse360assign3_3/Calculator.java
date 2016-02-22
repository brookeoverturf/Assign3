package cse360assign3_3;

public class Calculator {

	private int total;
	private String history = "0";
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	
	public int getTotal () {
		return total; 		//return total
	}
	
	public void add (int value) {
		total = total + value;		//add value to total
		history += ("\t+\t");			//add to history string
		history += (value);
		
	}
	
	public void subtract (int value) {
		total = total - value;		//subtract value from total
		history += ("\t-\t");			//add to history string
		history += (value);
		
	}
	
	public void multiply (int value) {
		total = total * value;		//multiply total by value
		history += ("\t*\t");			//add to history string
		history += (value);
		
	}
	
	public void divide (int value) {
		if( value == 0)
		{
			total = 0;		//if value is zero, set total to zero
		}
		else
		{
			total = total / value;  //divide total by value
		}
		
		history += ("\t/\t");			//add to history string
		history += (value);
		
	}
	
	public String getHistory() {
		return history;
	}
}