public abstract class Bank04{

	private String name;

	public Bank04(String name){
		this.name=name;
	}

	public abstract void display();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}//class