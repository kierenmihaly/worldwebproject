package day01;
//������01 - ��� ������
//�����ڶ�? ������ ���� �̿��Ͽ� ����ϴ� Ư�����ڵ��� �����ڶ�� �Ѵ�.
//��� �����ڴ� + - * / % 5������ �ִ�.

public class Ex03 {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 4;
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		System.out.println(number1 % number2);
		
		//������ ������ ������� �Ǽ��� �ٲ㺸��
		double number3 = number1 / number2;
		System.out.println(number3);
		//���� �ڵ�� 2.0�� ���´� �ֳ��ϸ� number��/number2�� ������� 2�� double�� �ٲ㼭
		//2.0�� �Ǳ� ����.
		
		//�츮�� ���ϴ� 2.5��� ���� ����Ϸ���
		//����/�Ǽ� or �Ǽ�/���� �� �����ؾ��Ѵ�.
		number3 = (double)number1/number2;
		System.out.println(number3);
		number3 = number1/(double)number2;
		System.out.println(number3);
		number3 = (double)number1/(double)number2;
		System.out.println(number3);
		
	}
}
