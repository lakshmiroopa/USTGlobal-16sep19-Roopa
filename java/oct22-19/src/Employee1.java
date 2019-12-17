public class Employee1 {
	String name;
	int eid;

	public Employee1(String name, int eid) {
		this.name = name;
		this.eid = eid;
		// we can not use this keyword inside static.
	}

	void printDetails() {
		System.out.println("Employee name is " + name);
		System.out.println("Employee id is " + eid);
	}

	void sayHello() {
		System.out.println("Hello " + name + " Welcome to UST Global");
	}

	public static void main(String[] args) {
		Employee1 e1 = new Employee1("deepika", 143);
		Employee1 e2 = new Employee1("rohini", 420);
		Employee1 e3 = new Employee1("karthik", 141);
		e1.printDetails();
		e1.sayHello();
		e2.printDetails();
		e2.sayHello();
		e3.printDetails();
		e3.sayHello();
	}

}
