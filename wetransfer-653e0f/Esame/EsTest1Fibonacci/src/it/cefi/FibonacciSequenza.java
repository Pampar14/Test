package it.cefi;

public interface FibonacciSequenza {
	
	public static String fibonacciSeq(int numero) {
		int fib0 = 0;
		int fib1 = 1;
		int next;
		StringBuilder fibonacci = new StringBuilder();

		for (int i = 0; i < numero; i++) {
			next = fib0 + fib1;
			fibonacci.append(next + " ");
			fib0 = fib1;
			fib1 = next;
			next = 0;
		}
		String fib = fibonacci.toString();
		return fib;
	}

}
