public class ExceptionTset04{

	private int sum;
	private int avg;

	public ExceptionTset04() {
	}

	public void sum(int x, int y) {
		System.out.println("1.==>sum 시작");
		sum = x + y;
		System.out.println("1.==>합: "+sum);
		System.out.println("1.==> sum 끝");
	}

	public void avg(int z) throws ArithmeticException{
		System.out.println("2.==>avg시작");
		avg = sum /z;
		System.out.println("2.==>평군:"+avg);
		System.out.println("2.==>avg끝");
	}

	public static void main(String[] args){

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

		ExceptionTset04 et = new ExceptionTset04();
		et.sum(i,j);

		try{
			et.avg(k);
		}catch(ArithmeticException e) {
			System.out.println("1.>>==========================");
			System.out.println("et.avg(k)에서 Exception 이 발생한 모양");
			System.out.println("2.>>==========================");
			System.out.println(e);
			System.out.println("3.>>==========================");
			e.printStackTrace();
			System.out.println("4.>>==========================");
		}

		System.out.println("main Method End...");

	}//,main

}//class