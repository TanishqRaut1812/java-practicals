//Demonstration of Library Management System using Inheritance (Single Inheritance)

public class LibraryManagementSystem {
	static class Book {
		int serialNo = 0;
		int amount = 0;
		Book(int a, int b) {
			serialNo = a;
			amount = b;
			System.out.println("Book: Serial No.: " + serialNo + " Amount: " + amount);
		}
	}

	static class Fiction extends Book {
		String series;
		Fiction(int a, int b, String s) {
			super(a, b);
			series = s;
			System.out.println("Fiction Series: " + series);
		}
	}

	public static void main(String[] args) {
		System.out.println(new Book(123, 499));
		System.out.println();
		System.out.println(new Fiction(456, 699, "Harry Potter"));
	}
}