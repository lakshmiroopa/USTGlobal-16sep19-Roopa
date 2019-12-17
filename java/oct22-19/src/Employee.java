public class Employee {
	String name;
	int eid;

	public Employee(String ename, int empid) {
		name = ename;
		eid = empid;
	}

	void printDetails() {
		System.out.println("Employee name is " + name);
		System.out.println("Employee id is " + eid);
	}

	public static void main(String[] args) {
		Employee e1 = new Employee("rashmika", 143);
		Employee e2 = new Employee("manasi", 420);
		Employee e3 = new Employee("vijay", 141);
		e1.printDetails();
		e2.printDetails();
		e3.printDetails();
	}

}
