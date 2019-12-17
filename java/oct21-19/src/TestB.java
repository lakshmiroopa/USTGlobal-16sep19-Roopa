public class TestB {
	public static void main(String[] args) {
		Cow c = new Cow();
		c.name = "rohini";
		c.color = "white";
		System.out.println("cow name is " + c.name);
		System.out.println("cow color is " + c.color);

		c.sleep();
		c.eat();

		System.out.println("**************************");

		Cow c1 = new Cow();
		c1.name = "ganga";
		c1.color = "black";
		System.out.println("cow name is " + c1.name);
		System.out.println("cow color is " + c1.color);

		c1.sleep();
		c1.eat();
	}
}
