package test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FibonacciTest {
	
	// An array containing the beginning of the Fibonacci sequence.
	private static final int[] fibNumbers = { 
			0, 1, 1, 2, 3, 5, 8, 13, 
			21, 34, 55, 89, 144, 233, 
			377, 610, 987, 1597, 2584, 
			4181, 6765, 10946, 17711, 28657, 
			46368, 75025, 121393, 196418, 317811 };
	
	// This is the FibonacciGenerator that we will use in all of our tests.
	private FibonacciGenerator fibGenerator;
	
	// A method that is called before the invocation of any test method.
	@Before public void makeNewGenerator() {
		fibGenerator = new FibonacciGenerator();
	}
	
	// A test method.
	@Test public void generateAndCheck() {
		
		// This for-loop takes each int in fibNumbers, sets the value of i to
		// that int, and then executes the code within the braces.
		for (int i : fibNumbers) {
			Assert.assertEquals(i, fibGenerator.next());
		}
		
		// This for-loop loops backwords from the last int in fibNumbers to the
		// first.
		for (int i = fibNumbers.length - 1; i >= 0; i--) {
			Assert.assertEquals(fibNumbers[i], fibGenerator.previous());
		}
		
		// We repeat the first for-loop, to ensure that our calls to prev have 
		// returned the generator to the beginning of the Fibonacci sequence.
		for (int number : fibNumbers) {
			Assert.assertEquals(number, fibGenerator.next());
		}

	}
	
	// Another test method.
	@Test(expected=IllegalStateException.class)
	public void callIllegalPrevious() {
		
		// Calling prev here should result in an exception, because the 
		// first number returned by a FibonacciGenerator is 0, and there is 
		// no Fibonacci before 0.	
		fibGenerator.previous();
	}
	
	// A method that is called after the invocation of every test method.
	@After public void nullGenerator() {
		fibGenerator = null;
	}
	
}
