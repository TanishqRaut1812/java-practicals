public class pattern {

	static void logic1 (int size) {
		System.out.println("Size: " + size);
		if (size % 2 == 0) {
			System.out.println("Invalid Input, only Odd input allowed");
			System.out.println();
			return;
		}
		int space = 1;
		for (int line = 1; line <= (size + 1) / 2; line++) {
			if (line == 1) {
				System.out.println(" ".repeat((size + 1) / 2 - 1) + "*");
			}
			else {
				System.out.println(" ".repeat((size + 1) / 2 - line) + "*" + " ".repeat(space) + "*");
				space += 2;
			}
		}
		space -= 2;
		for (int line = (size + 1) / 2 - 1; line >= 1; line--) {
			if (line == 1) {
				System.out.println(" ".repeat((size + 1) / 2 - 1) + "*");
			}
			else {
				space -= 2;
				System.out.println(" ".repeat((size + 1) / 2 - line) + "*" + " ".repeat(space) + "*");
			}
		}
		System.out.println();
	}

	static void logic2 (int size) {
		System.out.println("Size: " + size);
		if (size % 2 == 0) {
			System.out.println("Invalid Input, only Odd input allowed");
			System.out.println();
			return;
		}
		for (int line = 0; line < size; line++) {
			int initialSpace = Math.abs(size / 2 - line);
			for (int j = 0; j < size; j++) {
				if (j == initialSpace || j == size - initialSpace - 1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	static void logic3 (int size) {
		System.out.println("Size: " + size);
		if (size % 2 == 0) {
			System.out.println("Invalid Input, only Odd input allowed");
			System.out.println();
			return;
		}
		int mid = size / 2;
		for (int row = 0; row < size; row++) {
			for (int col = 0; col < size; col++) {
				if (Math.abs(row - mid) + Math.abs(col - mid) == mid) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main (String[] args) {
		logic1(10);
		logic1(11);
		logic2(11);
		logic3(11);
	}
}