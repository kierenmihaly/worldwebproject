package day030;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 5번");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
//첫번쨰 공백 유저넘버 - 1, 두번째는 유저넘버 -2 
		for (int i = 1; i <= userNumber; i++) {
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
