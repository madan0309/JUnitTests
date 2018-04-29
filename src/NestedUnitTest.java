import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Nested Unit Test Understanding")
class NestedUnitTest {
	@Test
	@DisplayName("Parent Test 1")
	void test1() {
		System.out.println("Parent Test 1");
	}
	
	@Test
	@DisplayName("Parent Test 2")
	void test2() {
		System.out.println("Parent Test 2");
	}
	
	@Nested
	@DisplayName("Child Tests")
	class ChildClass {
		@Test
		@DisplayName("Child Test 1")
		void test1() {
			System.out.println("Child Test 1");
		}
		
		@Test
		@DisplayName("Child Test 2")
		void test2() {
			System.out.println("Child Test 2");
		}
	}

}
