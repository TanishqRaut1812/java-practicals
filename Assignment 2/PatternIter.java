import java.util.Scanner;
public class PatternIter {
	public static void printPattern(int size) {
		if (size <= 0) {
			System.out.println("Invalid size");
			return;
		}
		
		System.out.println("Size: " + size);
		int mid = (size + 1) / 2;
		int initialSpace = 2 * (mid - 1);
		for (int row = 1; row <= mid; row++) {
			System.out.println(" ".repeat(initialSpace - (2 * (row - 1))) + "*".repeat(1 + (4 * (row - 1))));
		}
		if (size % 2 == 0) {
			for (int row = mid; row >= 1; row--) {
				System.out.println(" ".repeat(initialSpace - (2 * (row - 1))) + "*".repeat(1 + (4 * (row - 1))));
			}
		}
		else {
			for (int row = mid - 1; row >= 1; row--) {
				System.out.println(" ".repeat(initialSpace - (2 * (row - 1))) + "*".repeat(1 + (4 * (row - 1))));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
		printPattern(size);
		System.out.println();
		sc.close();
	}
}