//Demonstration of Exception Handling in Java

import java.io.FileReader;
import java.io.FileNotFoundException;
public class ExceptionHandling3 {
	public static void main(String[] args) throws FileNotFoundException {
		FileReader fr = new FileReader("ExceptionHandling3.java");
		
		int[] arr = { 10, 20, 15, 25, 8 };
		System.out.println(arr[arr.length]);
		
		int a = 10;
		int b = 0;
		int c = a / b;
		System.out.println("a / b = " + c);
	}
}