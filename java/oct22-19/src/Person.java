public class Person {
	String name;
	int age;
	String color;

	Person(String pname, int page, String pcolor) {
		name = pname;
		age = page;
		color = pcolor;
	}

	void printDetails() {
		System.out.println("Person name is " + name);
		System.out.println("Person age is " + age);
		System.out.println("Person color is " + color);
	}

	public static void main(String[] args) {
		Person p = new Person("roopa", 20, "white");
		p.printDetails();
	}
}
