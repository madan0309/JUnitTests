import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class CustomBeforeEachExtension implements BeforeEachCallback{
	
	@Override
	  public void beforeEach(ExtensionContext context) throws Exception {
	    // Implementation goes here
		System.out.println("Executing before each statements....");
	  }
	
}
