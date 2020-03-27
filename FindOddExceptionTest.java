class FindOddException extends Exception{

	public FindOddException() {
		System.out.println("==>FindOddException Default Constructor");
	}
	public FindOddException(String msg){
		super(msg);
		System.out.println("==>���ڰ� �ִ� FindOddException Constructor");
	}

}//class

public class FindOddExceptionTest{

	public void test(int number) throws FindOddException{

		System.out.println("::"+this.getClass().getName()+"start..");

		if(number % 2 == 0) {
			System.out.println("�Է��Ͻ� �� :"+number);
		}else{
			throw new FindOddException();
		}

		System.out.println("::"+this.getClass().getName()+"end..\n");
	}

	public static void main(String args[]){
		FindOddExceptionTest met = new FindOddExceptionTest();
		try{
			met.test(10);
			met.test(11);
		}catch(FindOddException e){
			System.out.println("\n e:"+e);
		}

	}//main
}//class