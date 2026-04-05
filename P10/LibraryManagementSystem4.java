//Demonstration of Library Management System using Inheritance (Hybrid Inheritance)

public class LibraryManagementSystem4 {

	static int totalBooks;

	static {
		totalBooks = 0;
		System.out.println("Static Block Initialized, Library Initialized");
	}
	
	static class Book {
		{
			totalBooks++;
			System.out.println("Init Block Initialized, Book object created");
		}
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

	static class Fantasy extends Fiction {
		String name;
		Fantasy(int a, int b, String s, String n) {
			super(a, b, s);
			name = n;
			System.out.println("Fantasy Book Name: " + name);
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

	static class Philosophy extends Novel {
		String name;
		Philosophy(int a, int b, String s, String n) {
			super(a, b, s);
			name = n;
			System.out.println("Philosophy Book Name: " + name);
		}
	}
	
	static class Reality extends Novel {
		String name;
		Reality(int a, int b, String s, String n) {
			super(a, b, s);
			name = n;
			System.out.println("Reality Book Name: " + name);
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

	static class Engineering extends Education {
		String name;
		Engineering(int a, int b, String s, String n) {
			super(a, b, s);
			name = n;
			System.out.println("Engineering Book Name: " + name);
		}
	}

	static class Buisness extends Education {
		String name;
		Buisness(int a, int b, String s, String n) {
			super(a, b, s);
			name = n;
			System.out.println("Buisness Book Name: " + name);
		}
	}

	static void displayTotalBooks() {
		System.out.println("Total Books: " + totalBooks);
	}

	public static void main(String[] args) {
		displayTotalBooks();
		System.out.println();
		new Book(123, 499);
		System.out.println();
		new Fiction(456, 699, "Harry Potter");
		System.out.println();
		new Novel(789, 299, "Alchemist");
		System.out.println();
		new Education(456, 379, "Computer Science");
		System.out.println();
		displayTotalBooks();
		System.out.println();
		new SciFi(347, 199, "Marvel", "Iron-Man");
		System.out.println();
		new Fantasy(654, 699, "Harry Potter", "Cursed Child");
		System.out.println();
		new Philosophy(8765, 349, "Sophie's World", "Everybody is Fu*ked");
		System.out.println();
		new Reality(3451, 560, "Human Behavior", "The Subtle Art Of Not Giving a Fu*k");
		System.out.println();
		new Engineering(7890, 799, "Information Technology", "Data Structures");
		System.out.println();
		new Buisness(2387, 899, "Buisness Analytics", "Market Value & Stratergy");
		System.out.println();
		displayTotalBooks();
	}
}