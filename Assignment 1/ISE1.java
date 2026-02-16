public class ISE1 {
	static void printPattern (int size) {
		System.out.println("Size: " + size);
		if (size % 2 == 0) {
			System.out.println("The entered value " + size + " is not odd. Please eneter an odd size.");
			System.out.println();
			return;
		}
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (col == row || col == size - row - 1) System.out.print("X");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main (String[] args) {
		printPattern(3);
		printPattern(5);
		printPattern(7);
		printPattern(8);
	}
}