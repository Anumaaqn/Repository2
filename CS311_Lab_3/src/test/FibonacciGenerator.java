package test;

/**
 * A FibonacciGenerator generates a stream of Fibonacci numbers
 * that can be traversed forwards or backwards.
 */

public class FibonacciGenerator {
	
	private int first = 0; // current Fib number
	private int second = 1; // next Fib number
	
	/**
	 * Returns the current Fibonacci number in this generator and 
	 * updates the stream to the next Fibonacci number.
	 * @return the current Fibonacci number
	 */
	public int next() {
		int oldFirst = first;
		
		first = second;
		second += oldFirst;
		
		return oldFirst;
	}

	/**
	 * Returns the previous Fibonacci number in this generator and 
	 * updates the stream to that number. 
	 * @return the previous Fibonacci number
	 */
	public int previous() {
		
		if (first == 0) {
			throw new IllegalStateException("generator is already at the start of the fibonacci sequence");
		}
		
		int oldFirst = first;
		
		first = second - first;
		second = oldFirst;
			
		return first;
	}
}
