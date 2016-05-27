public class CurrencyMain{
	public static void main(String[] args) {
		String input = "+R1,000.00|-R200.10|+R1,751.00|-R1,000,000.01|+R4234.99";
		System.out.println("\nSimple Play Currency Adder\n");
		System.out.println("Input: "+input+"\n");
		System.out.println("Calculating...");
		System.out.println(CurrencyAdd.Total(input));
	}
}