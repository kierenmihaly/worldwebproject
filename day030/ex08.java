package day030;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 8��");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();

		for (int i = 1; i <= 2 * userNumber - 1; i++) {
			String stars = "";
			if (i < userNumber) {
				// i�� 1~4���� �� ���κ�
				for (int j = 1; j <= userNumber - i; j++) {
					stars += " ";
				}
				for (int j = 1; j <= i; j++) {
					stars += "*";
				}
			} else {
				// i�� 5~9���� �� �Ʒ��κ�
				int lowerI = i - userNumber + 1;
				for (int j = 1; j <= lowerI - 1; j++) {
					stars += " ";
				}
				for (int j = lowerI; j <= userNumber; j++) {
					stars += "*";
				}
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
