

	private String name;
	private int age;
	private int id;

	public Student(String name, int age, int id){
		this.name = name;
		this.age=age;
		this.id=id;
	}
	public void print() {
		System.out.print("이름:"+getName()+"나이:"+getAge()+"학번:"+getid()+"\n");
	}

	public String getName(){
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	public int getid() {
		return this.id;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setAge(int age){
		this.age = age;
	}
	public void setid(int id){
		this.id = id;
	

	}
}









public class  Prob_12 {

	public static void main(String args[]) {

		Student s = new Student("홍길동", 20, 200201);
		Teacher t = new Teacher("이순신",30,"JAVA");
		Employee e = new Employee("유관순",40,"교무과");

		s.print();
		t.print();
		e.print();
	}
}
