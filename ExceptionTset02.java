public class ExceptionTest02{

	private int sum;
	private int avg;

	public ExceptionTest02(){
	}

	public void sum(int x, int y) {
		System.out.println("1.==>sum ����");
		sum = x + y;
		System.out.println("1.==>��:"+sum);
		System.out.println("1.==>sum ��");
	}

	public void avg(int z){
		System.out.println("2.==>avg ����");

		try{
			avg = sum / z;
		}catch(ArithmeticException e){
			System.out.println("1.>>=====================");
			System.out.println("z���� 0�� ��� �Դϴ�. ������ �Ұ�");
			System.out.println("2.>>=====================");
			System.out.println(e);
			System.out.println("3.>>=====================");
			e.printStackTrace();
			System.out.println("4.>>=====================");
		}
		System.out.println("���:"+avg);
		System.out.println("2.==> avg��");
	}


	public static void main(String[] args) {

		int i = Integer.parseInt(args[0]);
		int j = Integer.parseInt(args[1]);
		int k = Integer.parseInt(args[2]);

	ExceptionTest02 et = new ExceptionTest02();
	et.sum(i,j);
	et.avg(k);

	System.out.println("main Method End...");

	}//main

}//class