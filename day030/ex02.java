package day030;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 2��");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();
		// ��� �ؾ� userNumber, userNumber -1, -2 ....
		// �� �ɱ�?
		for (int i = 1; i <= userNumber; i++) {
			String stars = "";
			// ��� �ؾ� userNumber,
			// userNumber -1, -2 ....
			// �� �ɱ�?
			for (int j = i; j <= userNumber; j++) {
				// i�� 1�϶���
				// 1 2 3 4 5 5 �� �ݺ�
				// i �� 2�϶���
				// 2 3 4 5 4 �� �ݺ�
				// i �� 3�϶���
				// 3 4 5 3 ���ݺ�
				// Ƚ���� �Ź� �پ���

				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
