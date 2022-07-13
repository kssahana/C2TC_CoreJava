package classobjects;

class Student{
	int rollon;
	String name;
	void insertRecord(int r,String n) {
		rollon=r;
		name= n;
	}
	void displayInformation() {
		System.out.println(rollon +" " + name);
	}
}

public class Main {

	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student();
		s1.insertRecord(111, "karan");
		s2.insertRecord(222, "Aryan");
		s1.displayInformation();
		s2.displayInformation();

	}

}
