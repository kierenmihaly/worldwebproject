package day030;

import java.util.Scanner;

public class ex06 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 6��");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();

		for (int i = userNumber; i >= 1; i--) {
			String stars = "";
			for (int j = i; j <= userNumber - 1; j++) {
				stars += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
