public class TestC {
	public static void main(String[] args) {
		Person.color = "white";
		Person.sleep();
		System.out.println("Person color " + Person.color);

		System.out.println("---------------------------");

		Person p1 = new Person();
		p1.age = 20;
		p1.name = "roopa";
		System.out.println("Person name is " + p1.name);
		System.out.println("Person age is " + p1.age);
		p1.color = "black";
		p1.sleep();

		Person p2 = new Person();
		p1.age = 25;
		p1.name = "kowsi";
		System.out.println("Person name is " + p2.name);
		System.out.println("Person age is " + p2.age);

	}
}
