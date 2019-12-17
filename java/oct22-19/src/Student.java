public class Student {
	String name;
	int rollno;
	String branch;
	String dept;
	long phnno;

	Student(String name, int rollno, String branch, String dept, long phnno) {
		this.name = name;
		this.rollno = rollno;
		this.branch = branch;
		this.dept = dept;
		this.phnno = phnno;
	}

	void display() {
		System.out.println("Name of student is " + name);
		System.out.println("Rollno of student is " + rollno);
		System.out.println("Branch of student is " + branch);
		System.out.println("Department of student is " + dept);
		System.out.println("Phnno of student is " + phnno);
	}

	public static void main(String[] args) {
		Student s1 = new Student("roopa", 597, "pec", "CSE", 630551882);
		s1.display();
		Student s2 = new Student("kowsi", 595, "pec", "CSE", 930546882);
		s2.display();
		Student s3 = new Student("magi", 598, "pec", "CSE", 830549882);
		s3.display();
		Student s4 = new Student("yammu", 596, "pec", "CSE", 930098882);
		s4.display();
		Student s5 = new Student("raji", 599, "pec", "CSE", 630456882);
		s5.display();
		Student s6 = new Student("rohini", 591, "pec", "CSE", 990551882);
		s6.display();
		Student s7 = new Student("abipsa", 590, "pec", "CSE", 960546882);
		s7.display();
		Student s8 = new Student("sumaya", 592, "pec", "CSE", 970549882);
		s8.display();
		Student s9 = new Student("nandini", 594, "pec", "CSE", 930098882);
		s9.display();
		Student s10 = new Student("sindhu", 593, "pec", "CSE", 630424882);
		s10.display();
	}

}
