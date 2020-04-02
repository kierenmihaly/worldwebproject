public class Teacher01 extends Person{

	private String subject;

	public Teacher01() {
		super();
	}
	public Teacher01(String name, int age) {
		super(name,age);
	}
	public Teacher01(String name, int age, String subject) {
		super(name,age);
		this.subject = subject;
	}

	public void setSubject(String subject){
		this.subject = subject;
	}
	public String getSubject(){
		return subject;
	}
	public void print() {
		System.out.println("�̸�:"+getName()+"\t����:"+getAge()+"\t������:"+getSubject());
	}

}//class