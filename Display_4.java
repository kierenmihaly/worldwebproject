abstract class BusCharge{

	String section;

	public BusCharge(){
	}
	public BusCharge(String section) {
		this.section=section;
	}
	public void information() {
		System.out.println("������ݾȳ�");
	}

}//class

interface Fee{
	public void charge();
}//class


class Student extends BusCharge implements Fee{
	public Student(){
		super("�л�");
	}

	public void charge() {
		System.out.println("300��");
	}
}//class



class Adult extends BusCharge implements Fee{
	public Adult(){
		super("�Ϲ���");
	}
	public void charge() {
		System.out.println("500��");
	}

}//class



class Old extends BusCharge implements Fee{
	public Old(){
		super("���");
	}
	public void charge(){
		System.out.println("��¥");
	}
}//class



public class Display_4{
		
		public static void main(String args[]){

			

		}//main
}//class