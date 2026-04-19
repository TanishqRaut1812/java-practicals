class Example {
	public static void main(String args[]) {
		try {
			if (args.length < 2) {
				System.out.println("Error: Please provide exactly 2 arguments.");
				return;
			}
			
			if (args.length > 2) {
				System.out.println("Warning: Extra arguments will be ignored.");
			}
			
			String charInput = args[0];
			String str = args[1];
			
			if (charInput.length() != 1) {
				System.out.println("Error: First argument must be a single character.");
				return;
			}

			char ch = charInput.charAt(0);

			// Approach 1
			System.out.println("Approach 1:");
			for (int i = 0; i < str.length(); i++) {
				System.out.print(ch + "" + str.charAt(i));
			}
			System.out.println();

			// Approach 2
			System.out.println("Approach 2:");
			StringBuilder sb = new StringBuilder();
			for (char c : str.toCharArray()) {
				sb.append(ch).append(c);
			}
			System.out.println(sb);

		} 
		catch (Exception e) {
			System.out.println("Exception occurred: " + e.getMessage());
		}
	}
}