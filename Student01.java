public class Student01 extends Person{

	private int id;

	public Student01() {
		super();
	}
	public Student01(String name, int age) {
		super(name, age);
	}
	public Student01(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public void setld(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void print() {
		System.out.println("이름:"+getName()+"\t나이:"+getAge()+"\t학 번:"+getId());

	}

}//class