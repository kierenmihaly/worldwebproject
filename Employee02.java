public class Employee02
{
	String part;
	String name;
	int age;
	int baseSalary;

	public Employee02() {
		System.out.println("Emp�� default Constructor");
	}
	public Employee02(String name){
		this.name=name;
		System.out.println("Emp�� name�� �޴� Constructor");
	}
	public Employee02(String name, String part){
		this(name);
		this.part=part;
		System.out.println("Emp�� name,part�� �޴� Constructor");
	}
	public Employee02(String name, String part, int age) {
		this (name,part);
		this.age=age;
		System.out.println("Emp�� name,part,age�� �޴� Constructor");
	}

	public int salary(){
		System.out.println("Emp�� salay() method");
		baseSalary = 100;
		return baseSalary;
	}

}// class