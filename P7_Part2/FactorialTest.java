class FactorialTest {

	//Iterative Factorial Function
	static long iterFact(int num) {
		if (num >= 0) {
			long factorial = 1;
			for (int i = 1; i <= num; i++) {
				factorial *= i;
			}
			return factorial;
		}
		else {
			return -1; //Invalid input indicator
		}
	}

	//Recursive Factorial Function
	static long recurFact(int num) {
		if (num == 0 || num == 1) {
			return 1;
		}
		if (num < 0) {
			return -1; //Invalid input indicator
		}
		return num * recurFact(num - 1);
	}

	public static void main (String[] args) {
		int repetitions = 10000;
		int maxN = 15;
		long iterativeTotalTime = 0;
		long recursiveTotalTime = 0;
		
		//Recursive timing
		for(int r = 0; r < repetitions; r++) {
			for(int n = 1; n <= maxN; n++) {
				long start = System.nanoTime();
				iterFact(n);
				long end = System.nanoTime();
				iterativeTotalTime += (end - start);
			}
		}

		//Iterative timing
		for(int r = 0; r < repetitions; r++) {
			for(int n = 1; n <= maxN; n++) {
				long start = System.nanoTime();
				iterFact(n);
				long end = System.nanoTime();
				iterativeTotalTime += (end - start);
			}
		}
		
		long totalCalls = (long) repetitions * maxN;
		System.out.println("Iterative average time (ns): " + (iterativeTotalTime / (double) totalCalls));
		System.out.println("Recursive average time (ns): " + (recursiveTotalTime / (double) totalCalls));
	}
}