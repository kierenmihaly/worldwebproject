package day02;
//swutch���� break�� �Ϻη� �����ؼ�
//���α׷��� �ۼ��غ���

//����; ����ڷκ��� ���� �Է¹޾Ƽ�
//�� ������ ��¥�� 30������ 31������ 28������ ����ϴ� ���α׷� 
import java.util.Scanner;
public class ex07 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է����ּ���:");
		int month = scanner.nextInt();
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31�ϱ��� �Դϴ�.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30�ϱ����Դϴ�");
			break;
		case 2:
			System.out.println("28��");
			break;
		default:
			System.out.println("����");
			break;
		
		
		
		}
		
		
		scanner.close();
	}
}
