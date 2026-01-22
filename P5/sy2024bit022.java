public class sy2024bit022 {

    static void pattern1(int size) {
        System.out.println("Pattern 1:");
		String star = "*";
		String space = " ";
		for (int line = 1; line <= size; line++) {
			if (line == size) System.out.println(star.repeat(2 * size - 1));
			else System.out.println(star.repeat(line) + space.repeat(2 * (size - line) - 1) + star.repeat(line));
		}
    }
    
    static void pattern2(int size) {
		System.out.println("Pattern 2:");
		String star = "*";
		String space = " ";
		for (int line = 0; line < size; line++) {
			System.out.println(space.repeat(line) + star.repeat(size));
		}
	}
	
    static void pattern3(int size) {
		System.out.println("Pattern 3:");
		String star = "* ";
		String space = " ";
		for (int line = 1; line <= size; line++) {
			System.out.println(space.repeat(size - line) + star.repeat(line));
		}
		for (int line = size - 1; line >= 1; line--) {
			System.out.println(space.repeat(size - line) + star.repeat(line));
		}
	}

    static void pattern4(int size) {
		System.out.println("Pattern 4:");
		int num = 1;
		for (int line = 1; line <= size; line++) {
			for (int i = 1; i <= line; i++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}

    static void pattern5(int size) {
		System.out.println("Pattern 5:");
		String space = " ";
		for (int i = 1; i <= size; i++) {
			int num = i;
			System.out.print(space.repeat(size - i));
			for (int j = 1; j <= i; j++) {
				System.out.print(num + space);
				num++;
			}
			System.out.println();
		}
		for (int i = size - 1; i >= 1; i--) {
			int num = i;
			System.out.print(space.repeat(size - i));
			for (int j = 1; j <= i; j++) {
				System.out.print(num + space);
				num++;
			}
			System.out.println();
		}
	}

    public static void main(String[] args) {
    	pattern1(4);
		pattern2(4);
		pattern3(4);
		pattern4(4);
		pattern5(4);
    }
}
