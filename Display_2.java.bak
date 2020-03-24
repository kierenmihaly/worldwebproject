abstract class BusCharge{
	String section;

	public BusCharge(){
	}
	public BusCharge(String section) {
		this.section=section;
	}
	public void information() {
		System.out.println("버스요금안내");
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
	public Adult(){
		super("일반인");
	}
	public void charge() {
		System.out.println("500원");
	}

}//class

public class Display_2{
		
		public static void main(String args[]){

			BusCharge bc1 = new Student();
			BusCharge bc2 = new Adult();
			BusCharge bc3 = new Old();

			bc1.information();
			System.out.print(bc1.section);
			bc1.charge();

			bc2.information();
			System.out.print(bc2.section);
			bc2.charge();

			bc3.information();
			System.out.print(bc3.section);
			bc3.charge();

		}//main
}//class