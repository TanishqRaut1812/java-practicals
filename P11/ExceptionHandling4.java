//Demonstration of Exception Handling in Java

import java.io.FileReader;
import java.io.FileNotFoundException;
public class ExceptionHandling4 {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			fr = new FileReader("ExceptionHandling3.java");
			
		}
		catch(FileNotFoundException a) {
			System.out.println("Exception found in FileReader");
		}
		System.out.println(fr);

		try {
			int[] arr = { 10, 20, 15, 25, 8 };
			System.out.println(arr[arr.length]);
		}
		catch(ArrayIndexOutOfBoundsException b) {
			System.out.println("Exception found in Array");
		}

		try {
			int a = 10;
			int b = 0;
			int c = a / b;
			System.out.println("a / b = " + c);
		}
		catch(ArithmeticException c) {
			System.out.println("Exception found in Arithmetic");
		}
		
		System.out.println("Hi");
	}
}