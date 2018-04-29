import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Basics of JUnit Annotations")
public class Basics_JUnit {
	
	@BeforeEach
	@DisplayName("SettingUp the test")
	void before() {
		System.out.println("Before Each");
	}
	
	@AfterEach
	void after() {
		System.out.println("After Each");
	}
	
	@Test
	@DisplayName("Understanding Junit Part1")
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	@DisplayName("Understanding Junit Part2")
	void test2() {
		System.out.println("Test 2");
	}
	
	@Test
	@DisplayName("Understanding Junit Assertion 1")
	void test3() {
		int a = 10;
		int b = 20;
		int exp = 40;
		assertEquals(exp, a+b, "Error Message Goes Here");
		System.out.println("Assertion 1");
	}
	
	@Test
	@DisplayName("Understanding Junit Assertion 2")
	void test4() {
		int a = 10;
		int b = 20;
		int exp = 30;
		assertEquals(exp, a+b, "Error Message Goes Here");
		System.out.println("Assertion 2");
	}
	
	@BeforeAll
	static void before_all() {
		System.out.println("Before All");
		
	}
	
	@AfterAll
	static void after_all() {
		System.out.println("After All");
	}
}
