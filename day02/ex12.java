package day02;
//����ڷκ��� ���ڸ� �Է¹޾Ƽ�
//���丮���� ���ϴ� ���α׷��� �ۼ��ϼ���
//���丮���̶�? 1~ �ش���ڱ����� ��
import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int facto = 1;
		System.out.println("���ڸ� �Է����ּ���:");
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {
			// sum = sum + i;
			// ����������� ��� �ڱ� �ڽ��� ���� ��Ģ������ �ϴ� ���
			// �Ʒ��� �ڵ�ó�� �ٿ��ټ� �ִ�.
			facto *= i;

		}
		System.out.println(facto);
		scanner.close();
	}
}


//�������� �������� while�� ������ ��� ���� �� �ִ� ���α׷� 