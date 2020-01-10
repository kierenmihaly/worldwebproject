package day030;

import java.util.Scanner;

public class ex03 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 3번");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();

		for (int i = 1; i <= userNumber; i++) {
			String stars = "";
			// 공백을 담당하는 j for loop 1개
			for (int j = i; j <= userNumber - 1; j++) {
				stars += " ";
			}
			// 별을 담당하는 j or loop 1개
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
