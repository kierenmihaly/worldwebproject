package day030;

import java.util.Scanner;

public class ex07 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("별찍기 7번");
		System.out.print("출력할 줄 수를 입력하세요: ");
		int userNumber = scanner.nextInt();
		//i for loop이 분리된 형태 
		
		for (int i = 1; i <= userNumber; i++) {
			String stars = "";
			for(int j = 1; j <= i; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		for(int i = 1; i <= userNumber; i++) {
			String stars = "";
			for(int j = i; j <= userNumber; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
