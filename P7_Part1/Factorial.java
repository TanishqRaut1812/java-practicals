import java.util.Scanner;

class Factorial {

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
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		long iterFactResult = iterFact(num);
		long recurFactResult = recurFact(num);
		if (iterFactResult == -1 || recurFactResult == -1) {
			System.out.println("Factorial is undefined for negative number");
		}
		else {
			System.out.println(num + "!");
			System.out.println("Iterative Factorial: " + iterFactResult);
			System.out.println("Recursive Factorial: " + recurFactResult);
		}
		sc.close();
	}
}