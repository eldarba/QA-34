package selenium.over.junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CalculatorTest {
	
	private Calculator calculator = new Calculator();

	@Test
	@Order(1)
	void test1Add() {
		System.out.println("test 1 - add");
		calculator.add(100);
		int expectedResult = 100; // מה שמצפים לקבל
		int actualResult = calculator.getResult(); // מה שקיבלנו בפועל
		Assertions.assertEquals(expectedResult, actualResult, "add operation");
	}

	@Test
	@Order(2)
	void test2Clear() {
		System.out.println("test 2 - clear");
		calculator.clear();
		int expectedResult = 0; // מה שמצפים לקבל
		int actualResult = calculator.getResult(); // מה שקיבלנו בפועל
		Assertions.assertEquals(expectedResult, actualResult, "clear operation");
	}

}
