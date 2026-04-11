//Demonstration of Exception Handling in Java

import java.io.FileReader;
public class ExceptionHandling2 {
	public static void main(String[] args) {
		FileReader fr = new FileReader("abc");
		
		int[] arr = { 10, 20, 15, 25, 8 };
		System.out.println(arr[arr.length]);
		
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println("a / b = " + c);
	}
}