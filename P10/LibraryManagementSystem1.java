//Demonstration of Library Management System using Inheritance (Multi-Level Inheritance)

public class LibraryManagementSystem1 {
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

	static class SciFi extends Fiction {
		String name;
		SciFi(int a, int b, String s, String n) {
			super(a, b, s);
			name = n;
			System.out.println("Sci-Fi Book Name: " + name);
		}
	}

	public static void main(String[] args) {
		System.out.println(new Book(123, 499));
		System.out.println();
		System.out.println(new Fiction(456, 699, "Harry Potter"));
		System.out.println();
		System.out.println(new SciFi(789, 399, "Marvel Comics", "Iron-Man"));
	}
}