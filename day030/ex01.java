package day030;

import java.util.Scanner;

public class ex01 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 1��");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();
		for (int i = 1; i <= userNumber; i++) {
			String stars = "";
			for (int j = 1; j <= i; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
