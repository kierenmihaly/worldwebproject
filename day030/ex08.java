package day030;

import java.util.Scanner;

public class ex08 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 8번");
		System.out.print("출력할 별 수를 입력하세요: ");
		int userNumber = scanner.nextInt();

		for (int i = 1; i <= 2 * userNumber - 1; i++) {
			String stars = "";
			if (i < userNumber) {
				// i가 1~4까지 즉 윗부분
				for (int j = 1; j <= userNumber - i; j++) {
					stars += " ";
				}
				for (int j = 1; j <= i; j++) {
					stars += "*";
				}
			} else {
				// i가 5~9까지 즉 아랫부분
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
