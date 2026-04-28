import java.util.Scanner;
public class Pattern {
	static void printPattern(int size) {
		int row = 0;
		System.out.println("Size: " + size);
		System.out.println();
		System.out.println(" ".repeat(size) + "+");
		for(row = 1; row <= size; row++) {
			System.out.println(" ".repeat(size - row) + "+" + "*".repeat((2 * row) - 1) + "+");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int s = sc.nextInt();
		printPattern(s);
	}
}