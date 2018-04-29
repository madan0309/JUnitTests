import org.junit.jupiter.api.Assumptions;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import java.time.LocalDateTime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;

@DisplayName("Understanding of JUnit 5 Assertions")
class Assertions_More {

	@Test
	@DisplayName("Assertion Test 1")
	protected void test() {
		String p = "hello";
		String q = "hello";
		
		assertEquals(p, q, "Error message goes here");
	}
	
	@Test
	@DisplayName("Assertion Test 2")
	void test2() {
		String p = null;
		assertNull(p, "p should be null");
		p = "hello";
		assertNotNull(p, "p should not be null");
		
	}
		
	@Test
	@DisplayName("Assertion Test 3 Assert All")
	void test3() {
		String p = "hello";
		assertAll(
				"Assert all of these",
				() -> assertNotNull(p),
				//() -> assertNull(p, "Null Test"),
				() -> assertEquals(p , "hello")
				//() -> assertFalse(p.equals("hello"), "False Test")
				);
	}
	
	int div_nums(int a, int b) {
		return a/b;
	}
	
	@Test
	@DisplayName("Assertion Test 4, Assumption")
	void test4() {
		LocalDateTime ldt = LocalDateTime.now();
		assumeTrue(ldt.getDayOfWeek().getValue() == 5, "Not friday");
		System.out.println("If it is Friday Execute");
	}
	
	
	@Test
	@DisplayName("Assertion Test 5, Assert Throws")
	void test5() {
		assertThrows(ArithmeticException.class, () -> div_nums(2,0));
	}
	
	
	

}
