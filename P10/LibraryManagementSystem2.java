//Demonstration of Library Management System using Inheritance (Hierarchical Inheritance)

public class LibraryManagementSystem2 {
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

	static class Novel extends Book {
		String series;
		Novel(int a, int b, String s) {
			super(a, b);
			series = s;
			System.out.println("Novel Series: " + series);
		}
	}

	static class Education extends Book {
		String series;
		Education(int a, int b, String s) {
			super(a, b);
			series = s;
			System.out.println("Education Series: " + series);
		}
	}

	public static void main(String[] args) {
		System.out.println(new Book(123, 499));
		System.out.println();
		System.out.println(new Fiction(456, 699, "Harry Potter"));
		System.out.println();
		System.out.println(new Novel(789, 299, "Alchemist"));
		System.out.println();
		System.out.println(new Education(456, 379, "Computer Science"));
	}
}