public class Manager02 extends Employee{
	
	int salary;

	public Manager02(){
		System.out.println("Maneger�� default Constructor");
	}
	public Manager02(String name){
		super(name);
		System.out.println("Maneger�� name�� �޴� Constructor");
	}
	public Manager02(String name, String part){
		this(name);
		this.part=part;
		System.out.println("Manager�� name, part�� �޴� Constructor");
	}
	public Manager02(String name, String part, int age){
		super(name,part);
		this.age=age;
		System.out.println("Manager�� name, part, age�� �޴� Constructor");
	}
	public Manager02(String name, String part,int age, int salary){
		this(name,part,age);
		this.salary=salary;
		System.out.println("Manager�� name,part,age,salary�� �޴� Constructor");
	}

	public int Salary(){
		System.out.println("Manager�� salay method");
		baseSalary = 200;
		return baseSalary;
	}
	public void callSalary(){
		System.out.println("Employee�� �⺻���� : "+super.salary());
		System.out.println("Manager�� �⺻���� 1:"+this.salary());
		System.out.println("Manager�� �⺻���� 2:"+salary());
	}

	public static void main(String args[]){

		Manager m1 = new Manager("ȫ�浿");

	}//main

}//class
