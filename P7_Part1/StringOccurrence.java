import java.util.Scanner;

class StringOccurrence {

	static int iterLogic1(String s1, String s2) {
		if (s1 == null || s2 == null || s2.length() == 0 || s2.length() > s1.length()) return 0;

		int count = 0;
		for (int i = 0; i <= s1.length() - s2.length(); i++) {
			int j;
			for (j = 0; j < s2.length(); j++) {
				if (s1.charAt(i + j) != s2.charAt(j)) break;
			}
			if (j == s2.length()) count++;
		}
		return count;
	}

	static int recurLogic1(String s1, String s2, int index) {
		if (s1 == null || s2 == null || s2.length() == 0 || s2.length() > s1.length() || index > s1.length() - s2.length()) return 0;

		int j;
		for (j = 0; j < s2.length(); j++) {
			if (s1.charAt(index + j) != s2.charAt(j)) break;
		}
		if (j == s2.length()) return 1 + recurLogic1(s1, s2, index + 1);
		else return recurLogic1(s1, s2, index + 1);
	}

	static int iterLogic2(String s1, String s2) {
		if (s1 == null || s2 == null || s2.length() == 0 || s2.length() > s1.length()) return 0;
		
		int count = 0;
		for (int i = 0; i <= s1.length() - s2.length(); i++) {
			if (s1.substring(i, i + s2.length()).equals(s2)) count++;
		}
		return count;
	}

	static int recurLogic2(String s1, String s2, int index) {
		if (s1 == null || s2 == null || s2.length() == 0 || s2.length() > s1.length() || index > s1.length() - s2.length()) return 0;
		
		if (s1.substring(index, index + s2.length()).equals(s2)) return 1 + recurLogic2(s1, s2, index + 1);
		else return recurLogic2(s1, s2, index + 1);
	}

	static int iterLogic3(String s1, String s2) {
		if (s1 == null || s2 == null || s2.length() == 0) return 0;
		
		int count = 0;
		int index = 0;
		while ((index = s1.indexOf(s2, index)) != -1) {
			count++;
			index = index + 1;
		}
		return count;
	}

	static int recurLogic3(String s1, String s2, int index) {
		if (s1 == null || s2 == null || s2.length() == 0) return 0;
		
		int foundIndex = s1.indexOf(s2, index);
		if (foundIndex == -1) return 0;
		return 1 + recurLogic3(s1, s2, foundIndex + 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter String 1 and String 2: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();

		System.out.println("Logic 1 Iterative: " + iterLogic1(s1, s2));
		System.out.println("Logic 1 Recursive: " + recurLogic1(s1, s2, 0));

		System.out.println("Logic 2 Iterative: " + iterLogic2(s1, s2));
		System.out.println("Logic 2 Recursive: " + recurLogic2(s1, s2, 0));

		System.out.println("Logic 3 Iterative: " + iterLogic3(s1, s2));
		System.out.println("Logic 3 Recursive: " + recurLogic3(s1, s2, 0));

		sc.close();
	}
}