public class TestA {
	public static int add(int a, int b) {
		System.out.println("add(int a,int b) method");
		return a + b;
	}

	public static int add(int a, byte b) {
		System.out.println("add(int a,byte b) method");
		return a + b;
	}

	public static long add(long a, int b) {
		System.out.println("add(long a,int b) method");
		return a + b;
	}

	public static int multiply(int a, int b) {
		System.out.println("multiply(byte a,int b) method");
		return a * b;
	}

	public static void main(String[] args) {
		System.out.println("main(String[] args) method");
		main(10);
		add(29, 40);
		add(34, 54);
		multiply(12, 40);

	}

	public static void main(int a) {
		System.out.println("main(int a) method");
	}
}
