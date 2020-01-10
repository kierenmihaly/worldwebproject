package day030;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 4번");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		// 첫째 공백 0 ,두번째 공백 1 ,마지막에 i -1
		for (int i = 1; i <= userNumber; i++) {
			String stars = "";
			for (int j = 1; j <= i - 1; j++) {
				stars += " ";
			}
			for (int j = i; j <= userNumber; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
