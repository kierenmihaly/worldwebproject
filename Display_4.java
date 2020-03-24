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

}//class

interface Fee{
	public void charge();
}//class


class Student extends BusCharge implements Fee{
	public Student(){
		super("학생");
	}

	public void charge() {
		System.out.println("300원");
	}
}//class



class Adult extends BusCharge implements Fee{
	public Adult(){
		super("일반인");
	}
	public void charge() {
		System.out.println("500원");
	}

}//class



class Old extends BusCharge implements Fee{
	public Old(){
		super("어르신");
	}
	public void charge(){
		System.out.println("공짜");
	}
}//class



public class Display_4{
		
		public static void main(String args[]){

			

		}//main
}//class