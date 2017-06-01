import static org.junit.Assert.*;

import org.junit.Test;

public class UnitTest {
	@Test
	public void simpleTest() {
		int a = 1;
		int b = 2;
		assertTrue ( a + b == 3);
		
	}
	
	@Test
	public void simpleTestFail() {
		int a = 2;
		int b = 2;
		assertTrue ( a + b == 4);
		
	}
}
