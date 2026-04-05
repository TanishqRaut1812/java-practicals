import java.util.Scanner;
public class PatternRecur {
	public static void printRow(int initialSpace, int row) {
		System.out.println(" ".repeat(initialSpace - (2 * (row - 1))) + "*".repeat(1 + (4 * (row - 1))));
	}
	
	public static void printUpper(int row, int mid, int initialSpace) {
		if (row > mid) return;
		printRow(initialSpace, row);
		printUpper(row + 1, mid, initialSpace);
	}
	
	public static void printLower(int row, int initialSpace) {
		if (row < 1) return;
		printRow(initialSpace, row);
		printLower(row - 1, initialSpace);
	}
	
	public static void printPattern(int size) {
		if (size <= 0) {
			System.out.println("Invalid size");
			return;
		}
		
		System.out.println("Size: " + size);
		int mid = (size + 1) / 2;
		int initialSpace = 2 * (mid - 1);
		printUpper(1, mid, initialSpace);
		if (size % 2 == 0) printLower(mid, initialSpace);
		else printLower(mid - 1, initialSpace);
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