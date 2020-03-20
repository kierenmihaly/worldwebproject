public class Manager02 extends Employee{
	
	int salary;

	public Manager02(){
		System.out.println("Maneger의 default Constructor");
	}
	public Manager02(String name){
		super(name);
		System.out.println("Maneger의 name을 받는 Constructor");
	}
	public Manager02(String name, String part){
		this(name);
		this.part=part;
		System.out.println("Manager의 name, part을 받는 Constructor");
	}
	public Manager02(String name, String part, int age){
		super(name,part);
		this.age=age;
		System.out.println("Manager의 name, part, age을 받는 Constructor");
	}
	public Manager02(String name, String part,int age, int salary){
		this(name,part,age);
		this.salary=salary;
		System.out.println("Manager의 name,part,age,salary을 받는 Constructor");
	}

	public int Salary(){
		System.out.println("Manager의 salay method");
		baseSalary = 200;
		return baseSalary;
	}
	public void callSalary(){
		System.out.println("Employee의 기본급은 : "+super.salary());
		System.out.println("Manager의 기본급은 1:"+this.salary());
		System.out.println("Manager의 기본급은 2:"+salary());
	}

	public static void main(String args[]){

		Manager m1 = new Manager("홍길동");

	}//main

}//class
