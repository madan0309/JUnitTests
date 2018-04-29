import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedJUnitTest {

	@RepeatedTest(value = 10, name = "{displayName} {currentRepetition}/{totalRepetitions}")
	@DisplayName("repeat")
	void test() {
		System.out.println("Repeated Test");
	}
	
}
