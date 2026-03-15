public class StringTimeTest {
	public static void main(String[] args) {
		
		String str = "UTSAV";
		StringBuffer sbuf = new StringBuffer("UTSAV");
		StringBuilder sbuil = new StringBuilder("UTSAV");
		long totalStringTime = 0;
		long totalStringBufferTime = 0;
		long totalStringBuilderTime = 0;
		
		for(int i = 1; i <= 2026; i++) {
			long start = System.nanoTime();
			str = str + "_" + i;
			long end = System.nanoTime();
			totalStringTime += (end - start);
		}

		for(int i = 1; i <= 2026; i++) {
			long start = System.nanoTime();
			sbuf.append("_").append(i);
			long end = System.nanoTime();
			totalStringBufferTime += (end - start);
		}

		for(int i = 1; i <= 2026; i++) {
			long start = System.nanoTime();
			sbuil.append("_").append(i);
			long end = System.nanoTime();
			totalStringBuilderTime += (end - start);
		}

		System.out.println("Total String Time: " + totalStringTime + " ns");
		System.out.println("Total StringBuffer Time: " + totalStringBufferTime + " ns");
		System.out.println("Total StringBuilder Time: " + totalStringBuilderTime + " ns");
		
	}
}