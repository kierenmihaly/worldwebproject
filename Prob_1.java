import java.util.Scanner;

public class Prob_1{
	public static void main(String[] args){
	
	Scanner keyboard = new Scanner(System.in);
	System.out.print("1���� ũ�� 10���� ���� ������ �Է��ϼ���:");
	int num = keyboard.nextInt();

	if (2 <= num && num <= 9){

		for(int i = 0; i < 9; i++) {

	System.out.println(num+"*"+(i+1)+"="+(num*(i+1)));

	}
}
	
	else if(num < 2 ||  num>9)
		{
		System.out.println("�߸��� ���ڰ� �ԷµǾ����ϴ�.");
		}

	}//main
}//class