public class TestB {
	static int c;
	int a;
	{
		a = 10;
		c = 20;
		System.out.println("Instance block 1");
	}

	public static void main(String[] args) {
		System.out.println("main started");
		TestB b = new TestB();
		TestB b1 = new TestB();
		System.out.println("a value is " + b.a);
		System.out.println("a value is " + b1.a);
		System.out.println("c value is " + c);
		System.out.println("main ended");
	}

	{
		a = 20;
		System.out.println("Instance block 2");
	}

}
