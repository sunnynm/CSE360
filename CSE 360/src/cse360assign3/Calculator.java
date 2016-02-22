package cse360assign3;

/** Program made Calculator
 * 
 * @author Sunny Mahesh PIN: 522
 * 
 * @version Feb 22, 2016
 * 
 * repo link: https://github.com/sunnynm/CSE360
 */

public class Calculator {

	private int total;
	private String history;
	
	public Calculator () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	public int getTotal () {
		return total;
	}
	
	public void add (int value) {
		total += value;
		history += " + " + value; 
	}
	
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}
	
	public void multiply (int value) {
		total *= value;
		history += " * " + value;
	}
	
	public void divide (int value) {
		if (value == 0)
			total = 0;
		else
			total = total/value;
		history += " / " + value;
	}
	
	public String getHistory () {
		return history;
	}
}