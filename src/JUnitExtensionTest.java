import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(CustomBeforeEachExtension.class)
class JUnitExtensionTest {

	@BeforeEach
	void before() {
		System.out.println("Before Each");
	}
	
	@Test
	void test() {
		System.out.println("Test 1");
	}
	
	@Test
	void test2() {
		System.out.println("Test 2");
	}

}
