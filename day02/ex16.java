package day02;
//�ݺ��� - while loop
//while loop�� ���
//()�� ������ ���̸� �ݺ�
//false �� ���� �Ǵ� �����̴�.
public class ex16 {
	public static void main(String[] args) {
		int number = 0;
		while(number < 5) {
			System.out.println(number);
			number++;
		}
		//�׷��� ���ѷ����� ��� �����?
		//���ѷ����� �ݺ����� ������ ������� �ʴ� ���¸�
		//���ѷ������ �Ѵ�.
		number = 0;
		
		//1. ������ �ϳ� ���� �ش� ������ ������ �������� 
		//�ݺ��� ��Ű�� ������ ��ȭ�� ���� ���ش�.
		//while(number < 5) {
		//	System.out.println(number);	
		//}
		
		//2. �׻� ���� �Ǵ� ���ǽ��� �����.
		//while( 0 < 1) {
		//	System.out.println("���ѷ���");			
		//}
		
		//3. true�� �ִ´�.
		//while(true) {
		//	System.out.println("���ѷ���");
		//}
		
		//do-while vs while 
		//do-while ������ �ѹ��� ������ ������ �ȴ�
		number = 6;
		do {
			System.out.println(number);
		}while(number < 5);
		
		while(number < 5) {
			System.out.println(number);
		}
		
	}
}
