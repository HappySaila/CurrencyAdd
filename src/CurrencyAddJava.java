//Author: Grant Wilson
//Date Created: 26 May 2016


public class CurrencyAddJava{
	//Responsible for adding a string of currency values and out the sum in currency form
	//eg. (+R1,000.00|-R200.10|+R1,751.00|+R1,000,000.01) to a sum total
	
	public static float ConvertToCents(String input){
		//will convert the input into a float, the total sum number in a float value. Still needs to converted into Currency format
		//String must have all values divided by a "|"
		String[] values = input.split("|"); 
	}
}
