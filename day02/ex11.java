package day02;

//����ڷκ��� �Է��� �޾Ƽ�
//1~�׼��ڱ����� ���� ���ϴ� ���α׷��� �ۼ��ϼ���.
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� �Է����ּ���:");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			// sum = sum + i;
			// ����������� ��� �ڱ� �ڽ��� ���� ��Ģ������ �ϴ� ���
			// �Ʒ��� �ڵ�ó�� �ٿ��ټ� �ִ�.
			sum += i;

		}
		System.out.println(sum);
		scanner.close();
	}
}
