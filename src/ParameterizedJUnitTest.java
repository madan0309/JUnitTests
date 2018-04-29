import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedJUnitTest {

	@ParameterizedTest(name = "{index} ==> Argument = ''{0}''")
	@ValueSource(strings = {"Madan", "Mohan", "Maddy", "Master"})
	void test(String id, TestInfo testinfo) {
		System.out.println(testinfo.getDisplayName());
	}
}
