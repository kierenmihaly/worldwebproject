package day02;
//����ڷκ��� ������ �Է��� �޾Ƽ�
//a b c d e �� ����ϴ� ���α׷��� �ۼ��ϼ��� 
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int score = scanner.nextInt();
		//���ǽ� �ȿ� AND �������ڸ� ���ؼ�
		//������ ����� true�϶��� ������ �ȴ�.
		// if(score <= 100 && score >= 90) ���� ������� // (100 >= scroe >= 90) �̰� �ȵ� 
		if(score <= 100 && score >= 90) {
			System.out.println("a");
		}else if(score < 90 && score >= 80) {
			System.out.println("b");
		}else if(score < 80 && score >= 70) {
			System.out.println("c");
		}else if(score < 70 && score >= 60) {
			System.out.println("d");
		}else if(score < 60 && score >= 0) {
			System.out.println("e");
		}else {
			System.out.println("����");
		}

		scanner.close();

		}
	}
