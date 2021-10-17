package calculator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.CoreMatchers.is;

import static org.junit.Assert.assertThat;

public class StringCalculatorShould {

	@SuppressWarnings("deprecation")
	@Test
	public void sumsEmptyStringTo0() {
		assertThat(StringCalculator.Add(""), is(0));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void sumsSingleNumberToItself() {
		assertThat(StringCalculator.Add("1"), is(1));
		//assertThat(StringCalculator.Add("42"), is(42));
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void sumsTwoNumbersSeperatedByComma() {
		assertThat(StringCalculator.Add("1,2"), is(3));
		//assertThat(StringCalculator.Add("1,3"), is(4));
	}
}