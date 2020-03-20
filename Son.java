public class Son extends Iam{

	String school;

	public Son(){
		System.out.println("Son class default Constructor");
	}
	
	public void setSchool(String str){
		school = str;
	}

	public String getSchool(){
		return school;
	}

	public static void main (String args[]) {

		Son son = new Son();

	}//main

}//class
