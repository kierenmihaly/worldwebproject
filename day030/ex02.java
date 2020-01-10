package day030;

import java.util.Scanner;

public class ex02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 2번");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		// 어떻게 해야 userNumber, userNumber -1, -2 ....
		// 이 될까?
		for (int i = 1; i <= userNumber; i++) {
			String stars = "";
			// 어떻게 해야 userNumber,
			// userNumber -1, -2 ....
			// 이 될까?
			for (int j = i; j <= userNumber; j++) {
				// i가 1일때는
				// 1 2 3 4 5 5 번 반복
				// i 가 2일때는
				// 2 3 4 5 4 번 반복
				// i 가 3일때는
				// 3 4 5 3 번반복
				// 횟수가 매번 줄어든다

				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
