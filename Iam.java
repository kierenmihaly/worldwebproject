public class  Iam extends Human{

	String job;

	public Iam(){
		System.out.println("Iam class default Constructor");
	}

	public void setJob(String str){
		job = str;
	}

	public String getJob(){
		return job;
	}

	public static void main(String args[]) {
		Iam iam = new Iam();

	}//main

}//class
