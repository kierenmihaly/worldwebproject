public class  Test3_1
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);	
		int j = Integer.parseInt(args[1]);

if(i%2==0 && i%3==0) {
	System.out.println("�Է��Ͻ� 1��° ���ڰ� "+i+" �� ¦���̸� 3�� ����Դϴ�.");
}if(i%2==0 && i%3!=0) {
	System.out.println("�Է��Ͻ� 1��° ���ڰ� "+i+" �� ¦���̸� 3�� ����� �ƴմϴ�.");
}if(i%2!=0 && i%3==0) {
	System.out.println("�Է��Ͻ� 1��° ���ڰ� "+i+" �� Ȧ���̸� 3�� ����Դϴ�. ");
}if(i%2!=0 && i%3!=0) {
	System.out.println("�Է��Ͻ� 1��° ���ڰ� "+i+" �� Ȧ���̸� 3�� ����� �ƴմϴ�.");
}
else {
	if(j%2==0 && j%3==0) {
		System.out.println("�Է��Ͻ� 1��° ���ڰ� "+j+" �� ¦���̸� 3�� ����Դϴ�.");
	}if(j%2==0 && j%3!=0) {
		System.out.println("�Է��Ͻ� 1��° ���ڰ� "+j+" �� ¦���̸� 3�� ����� �ƴմϴ�.");
	}if(j%2!=0 && j%3==0) {
		System.out.println("�Է��Ͻ� 1��° ���ڰ� "+j+" �� Ȧ���̸� 3�� ����Դϴ�. ");
	}if(j%2!=0 && j%3!=0) {
		System.out.println("�Է��Ͻ� 1��° ���ڰ� "+j+" �� Ȧ���̸� 3�� ����� �ƴմϴ�.");

	}
}



	}//end of main
}// end of class
