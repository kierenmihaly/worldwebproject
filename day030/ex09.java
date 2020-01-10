package day030;

import java.util.Scanner;

public class ex09 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 9번");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		// i for loop이 분리된 형태

		for (int i = 1; i <= 2 * userNumber; i++) {
			String stars = "";
			if (i < userNumber) {
				// 윗부분
				for (int j = 1; j <= userNumber - i; j++) {
					stars += " ";
				}
				for (int j = 1; j <= i * 2 - 1; j++) {
					stars += "*";
				}

			} else {
				// 아랫부분
				int lowerI = i - userNumber + 1;
				// lowerI - > 5 6 7 8 9
				for (int j = 1; j <= lowerI; j++) {
					stars += " ";
				}
				
				//
				// 별을 어떻게 해야 9 7 5 3 1 이 나올까?
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
