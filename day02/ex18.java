package day02;

import java.util.Scanner;

//�л����κ��� ������ �Է¹޾Ƽ�
//abcdf�� ��µǴ� 
//���ѷ��� ���α׷��� ���弼��!
import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("�����Է��ض�(-1�� ����)");
			int score = scanner.nextInt();
			if (score == -1) {
				System.out.println("������ּż� ����");
				break;
			} else {
				if (score <= 100 && score >= 90) {
					System.out.println("a");
				} else if (score < 90 && score >= 80) {
					System.out.println("b");
				} else if (score < 80 && score >= 70) {
					System.out.println("c");
				} else if (score < 70 && score >= 60) {
					System.out.println("d");
				} else if (score < 60 && score >= 0) {
					System.out.println("f");
				} else {
					System.out.println("����");
				}
			}
		}

		scanner.close();
	}
}
