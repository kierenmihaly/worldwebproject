public class OuterClass01{

	private String outer = "OuterClass ÀÇ Field";

	public OuterClass01() {
}

	public void outerMethod() {
		System.out.println("::"+this.getClass().getName()+"start..");
		InnerClass ic = new InnerClass();
		ic.innerMethod();
		System.out.println("::"+this.getClass().getName()+"end..");
	}

	public class InnerClass{

	private String inner = "InnerClass ÀÇ Field";

	public InnerClass(){
	}

	public void innerMethod(){

		System.out.println("==>"+this.getClass().getName()+"start.");
		System.out.println(outer);
		System.out.println(OuterClass01.this.outer);
		System.out.println(inner);
		System.out.println("==>"+this.getClass().getName()+"end..");
	}
	}//class
	

	public static void main(String[] args) {
		new OuterClass01().outerMethod();
	}//main

}//class
