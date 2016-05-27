//Author: Grant Wilson
//Date Created: 26 May 2016


public class CurrencyAdd{
	//Responsible for adding a string of currency values and out the sum in currency form
	//eg. "+R1,000.00|-R200.10|+R1,751.00|+R1,000,000.01" to a sum total

	public static String Total(String input){
		//will convert the input into a float, the total sum number in a float value. Still needs to converted into Currency format
		//String must have all values divided by a pipe ("|")
		String intValueString;
		String[] stringValues = input.split("\\|"); //converts the string to an array of strings. seperated by pipes
		char currencySymbol = stringValues[0].charAt(1); //used to store the symbol of the currency. store as "R" by default
		int intValue = 0;
		int totalAmount = 0;
		for (String val : stringValues){
			intValue+=cleanData(val);
		}
		if (intValue>=0){
			intValueString = "+"+intValue;
		}else{
			intValueString = intValue+"";
		}
		String currency = ConvertToCurrency(intValueString, currencySymbol);//return the final answer;
		return currency;
	}

	private static int cleanData(String val){
		//will take in data in a currency for along with a sign "+,-" and return an int
		//eg. -R1,234,567.89 will return -123456789
		//cleans data, replaces commas with full stops and gets rid of currency symbol,,, eg "R" "$"

		val = val.replace(",","");
		val = val.replace(".","");
		val = val.substring(0,1)+val.substring(2);//removing the currency symbol
		int intVal = Integer.parseInt(val);
		return intVal;
	}

	private static String ConvertToCurrency(String val, char currencySymbol){
		//convert an integer value into a string value
		//eg.. -123456789 will return  -R1,234,567.89
		char sign = val.charAt(0);
		val = val.substring(1);
		String cents = val.substring(val.length()-2);
		val = val.substring(0,val.length()-2);
		String currency = "";
		while (val.length()>3){
			currency =  "," + val.substring(val.length()-3) + currency;
			val = val.substring(0,val.length()-3);
		}
		//add the decimal and the currency symbol. also add the last numbers after the final comma eg. R12,345.00 val==12
		currency = sign + "" + currencySymbol + "" + val + "" + currency + "." + cents;
		return currency;
	}
}
