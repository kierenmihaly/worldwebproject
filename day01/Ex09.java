package day01;
//����ڷκ���
//�л���ȣ, �̸�, ����, ����, ���� ������ �Է¹޾Ƽ�
//����ϴ� ���α׷��� �ۼ��ϼ���
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�л���ȣ: ");
		int studentNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("�л��̸�: ");
		String studentName = scanner.nextLine();
		
		System.out.println("����: ");
		int korean = scanner.nextInt();
		System.out.println("����: ");
		int english = scanner.nextInt();
		System.out.println("����: ");
		int math = scanner.nextInt();
		
		System.out.println("ȸ����ȣ: " + studentNumber);
		System.out.println("ȸ���̸�: " + studentName);
		System.out.println("����: " + korean);
		System.out.println("����: " + english);
		System.out.println("����: " + math);
	
		scanner.close();
	}

}
