public class Employee04 extends Person{

	private String dept;

	public Employee04() {
		super();
	}
	public Employee04(String name, int age) {
		super(name,age);
		this.dept = dept;
	}

	public void setDept(String dept){
		this.dept = dept;
	}
	public String getDept() {
		return dept;
	}
	public void print() {
		System.out.println("이름:"+getName()+"\t나이:"+getAge()+"\t부 서:"+getDept());
	}
}//class