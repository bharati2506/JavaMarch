package package1;

public class student {
	int rollno;
	int age;
	public void display1()
	{
		System.out.println("Welcome all of you");
	}
	
	public void display2()
	{
		System.out.println("Automaton is very easy");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stud = new student();
		stud.rollno =100;
		stud.age =12;
		System.out.println("Student roll no: " +stud.rollno);
		System.out.println("Student age is: "+stud.age);
		stud.display1();
		stud.display2();
	}
	
	

}
