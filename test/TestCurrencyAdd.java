import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import org.junit.Test;
//Author: Grant Wilson
//Date Created: 27 May 2016
public class TestCurrencyAdd {
	@Test
	public void Test1() {
		//will test if program runs when on any currency symbol is used
		String input = "+R10,500.00|+R32,025.34|+R40,300.89";
		String output = CurrencyAdd.Total(input);
		assertTrue(output.equals("+R82,826.23"));
	}
	@Test
	public void Test2() {
		//will test if program runs when no currency symbol is used
		String input = "-$10,500.00|-$32,025.34|-$40,300.89";
		String output = CurrencyAdd.Total(input);
		assertTrue(output.equals("-$82,826.23"));
	}
	@Test
	public void Test3() {
		//will test if program runs when no currency symbol is used
		String input = "+$100,500.00|+$320,025.34|+$400,300.89";
		String output = CurrencyAdd.Total(input);
		assertTrue(output.equals("+$820,826.23"));
	}
	
}