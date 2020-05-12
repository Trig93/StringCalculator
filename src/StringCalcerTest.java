import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalcerTest {

	@Test
	void test0Numbers() {
		int expected = 0;
		int actual = StringCalculator.add("");
		assertEquals(expected, actual);
	}
	
	@Test
	void test1Number() {
		int expected = 1;
		int actual = StringCalculator.add("1");
		assertEquals(expected, actual);
	}
	
	@Test
	void test2Numbers() {
		int expected = 4;
		int actual = StringCalculator.add("2, 2");
		assertEquals(expected, actual);
	}
	
	@Test
	void testUnknownAmountNumbers() {
		int expected = 10;
		int actual = StringCalculator.add("2, 2, 2, 2, 2");
		assertEquals(expected, actual);
	}
	
	@Test
	void testNewDelim() {
		int expected = 10;
		int actual = StringCalculator.add("2\n 2, 2, 2, 2");
		assertEquals(expected, actual);
	}
	
	@Test
	void testDifferentDelim() {
		int expected = 10;
		int actual = StringCalculator.add("2\n 2, 2, 2, 2");
		assertEquals(expected, actual);
	}
	
	
}
