package day030;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 9��");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();
		// i for loop�� �и��� ����

		for (int i = 1; i <= 2 * userNumber; i++) {
			String stars = "";
			if (i < userNumber) {
				// ���κ�
				for (int j = 1; j <= userNumber - i; j++) {
					stars += " ";
				}
				for (int j = 1; j <= i * 2 - 1; j++) {
					stars += "*";
				}

			} else {
				// �Ʒ��κ�
				int lowerI = i - userNumber + 1;
				// lowerI - > 5 6 7 8 9
				for (int j = 1; j <= lowerI; j++) {
					stars += " ";
				}
				
				//
				// ���� ��� �ؾ� 9 7 5 3 1 �� ���ñ�?
				//userNumber * 2 - 1 - 2*lowerI - > 9
				for(int j = 1;
						j <= userNumber*2 -1 -2*lowerI; j++) {
					stars += "*";
				}
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
