public class Test {
	static {
		System.out.println("Static Block 1");
	}
	{
		System.out.println("Instance Block 2");
	}
	Test() {
		System.out.println("Constructor:: Test()");
	}
	Test(int x) {
		System.out.println("Constructor:: Test(int)");
	}
	{
		System.out.println("Instance Block 1");
	}

	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test(3);
		t1 = t2;
		t2 = new Test();
	}
	
	static {
		System.out.println("Static Block 2");
	}
}