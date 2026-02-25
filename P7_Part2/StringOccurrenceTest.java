class StringOccurrenceTest {

	static int iterLogic1(String s1, String s2) {
		if (s1 == null || s2 == null || s2.length() == 0 || s2.length() > s1.length()) return 0;

		int count = 0;
		for (int i = 0; i <= s1.length() - s2.length(); i++) {
			int j;
			for (j = 0; j < s2.length(); j++) {
				if (s1.charAt(i + j) != s2.charAt(j)) break;
			}
			if (j == s2.length()) count++;
		}
		return count;
	}

	static int recurLogic1(String s1, String s2, int index) {
		if (s1 == null || s2 == null || s2.length() == 0 || s2.length() > s1.length() || index > s1.length() - s2.length()) return 0;

		int j;
		for (j = 0; j < s2.length(); j++) {
			if (s1.charAt(index + j) != s2.charAt(j)) break;
		}
		if (j == s2.length()) return 1 + recurLogic1(s1, s2, index + 1);
		else return recurLogic1(s1, s2, index + 1);
	}

	static int iterLogic2(String s1, String s2) {
		if (s1 == null || s2 == null || s2.length() == 0 || s2.length() > s1.length()) return 0;
		
		int count = 0;
		for (int i = 0; i <= s1.length() - s2.length(); i++) {
			if (s1.substring(i, i + s2.length()).equals(s2)) count++;
		}
		return count;
	}

	static int recurLogic2(String s1, String s2, int index) {
		if (s1 == null || s2 == null || s2.length() == 0 || s2.length() > s1.length() || index > s1.length() - s2.length()) return 0;
		
		if (s1.substring(index, index + s2.length()).equals(s2)) return 1 + recurLogic2(s1, s2, index + 1);
		else return recurLogic2(s1, s2, index + 1);
	}

	static int iterLogic3(String s1, String s2) {
		if (s1 == null || s2 == null || s2.length() == 0) return 0;
		
		int count = 0;
		int index = 0;
		while ((index = s1.indexOf(s2, index)) != -1) {
			count++;
			index = index + 1;
		}
		return count;
	}

	static int recurLogic3(String s1, String s2, int index) {
		if (s1 == null || s2 == null || s2.length() == 0) return 0;
		
		int foundIndex = s1.indexOf(s2, index);
		if (foundIndex == -1) return 0;
		return 1 + recurLogic3(s1, s2, foundIndex + 1);
	}

	public static void main(String[] args) {
		String s1 = "TanTanTanTanishq Tan";
		String s2 = "Tan";
		int repetitions = 10000;
		long[] times = new long[6];
		
		for(int r = 0; r < repetitions; r++) {
			long start;

			start = System.nanoTime();
			iterLogic1(s1, s2);
			times[0] += System.nanoTime() - start;

			start = System.nanoTime();
			recurLogic1(s1, s2, 0);
			times[1] += System.nanoTime() - start;

			start = System.nanoTime();
			iterLogic2(s1, s2);
			times[2] += System.nanoTime() - start;

			start = System.nanoTime();
			recurLogic2(s1, s2, 0);
			times[3] += System.nanoTime() - start;

			start = System.nanoTime();
			iterLogic3(s1, s2);
			times[4] += System.nanoTime() - start;

			start = System.nanoTime();
			recurLogic3(s1, s2, 0);
			times[5] += System.nanoTime() - start;
		}

		System.out.println("Average execution time (ns):");
		System.out.println("Logic 1 Iterative: " + times[0] / (double) repetitions);
		System.out.println("Logic 1 Recursive: " + times[1] / (double) repetitions);
		System.out.println("Logic 2 Iterative: " + times[2] / (double) repetitions);
		System.out.println("Logic 2 Recursive: " + times[3] / (double) repetitions);
		System.out.println("Logic 3 Iterative: " + times[4] / (double) repetitions);
		System.out.println("Logic 3 Recursive: " + times[5] / (double) repetitions);
	}
}