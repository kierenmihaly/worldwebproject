public class Manager extends Employee{
	
	int salary;

	public Manager(){
		System.out.println("Maneger�� default Constructor");
	}
	public Manager(String str){
		super(str);
		System.out.println("Maneger�� name�� �޴� Constructor");
	}
	public Manager(String str1, String str2){
		this(str1);
		part = str2;
		age = i;
		System.out.println("Manager�� name,part,age�� �޴� Constructor");
	}
	public Manager(String str1, String str2, int i){
		this(str1, str2);
		salary = j;
		System.out.println("Manager�� name, part, age, salary�� �޴� Constructor");
	}

	public void callSalary(){
		System.out.println("Manager�� �⺻���� : " +salary());
	}

	public static void main(String args[]){

		Manager m1 = new Manager("ȫ�浿");


	}//main

}//class
