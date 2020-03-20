public class Manager extends Employee{
	
	int salary;

	public Manager(){
		System.out.println("Maneger의 default Constructor");
	}
	public Manager(String str){
		super(str);
		System.out.println("Maneger의 name을 받는 Constructor");
	}
	public Manager(String str1, String str2){
		this(str1);
		part = str2;
		age = i;
		System.out.println("Manager의 name,part,age을 받는 Constructor");
	}
	public Manager(String str1, String str2, int i){
		this(str1, str2);
		salary = j;
		System.out.println("Manager의 name, part, age, salary을 받는 Constructor");
	}

	public void callSalary(){
		System.out.println("Manager의 기본급은 : " +salary());
	}

	public static void main(String args[]){

		Manager m1 = new Manager("홍길동");


	}//main

}//class
