abstract class BusCharge{

	String section;
	public BusCharge(){
	}
	public BusCharge(String section) {
		this.section=section;
	}

	public abstract void charge();
	
	}//class

class Student extends BusCharge{
	public Student(){
		super("학생");
	}
	public void charge() {
		System.out.println("300원");
	}

}//class

class Adult extends BusCharge{
	public Adult() {
		super("일반인");
	}
	public void charge() {
		System.out.println("500원");
	}
}//class

class Old extends BusCharge {
	public Old() {
		super("어르신");
	}
	public void charge() {
		System.out.println("공짜");
	}
}//class

public class Display{

	public static void main(String args[]){

		Student b1 = new Student();
		Adult b2 = new Adult();
		Old b3 = new Old();

		b1.information();
		System.out.print(b1.section);
		b1.charge();

		b2.information();
		System.out.print(b2.section);
		b2.charge();

		b3.information();
		System.out.print(b3.section);
		b3.charge();

	}//main

}//class