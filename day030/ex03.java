package day030;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 3��");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();

		for (int i = 1; i <= userNumber; i++) {
			String stars = "";
			// ������ ����ϴ� j for loop 1��
			for (int j = i; j <= userNumber - 1; j++) {
				stars += " ";
			}
			// ���� ����ϴ� j or loop 1��
			for (int j = 1; j <= i; j++) {
				stars += "*";
			}
			/*
			 * for (int j = 5; j >= 0; j--) { if (i < j) { System.out.print(" "); } else {
			 * System.out.print("*"); } }
			 */
			System.out.println(stars);
		}
		scanner.close();
	}
}
