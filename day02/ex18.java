package day02;

import java.util.Scanner;

//학생으로부터 점수를 입력받아서
//abcdf가 출력되는 
//무한루프 프로그램을 만드세요!
import java.util.Scanner;

public class ex18 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("점수입력해라(-1은 종료)");
			int score = scanner.nextInt();
			if (score == -1) {
				System.out.println("사용해주셔서 감사");
				break;
			} else {
				if (score <= 100 && score >= 90) {
					System.out.println("a");
				} else if (score < 90 && score >= 80) {
					System.out.println("b");
				} else if (score < 80 && score >= 70) {
					System.out.println("c");
				} else if (score < 70 && score >= 60) {
					System.out.println("d");
				} else if (score < 60 && score >= 0) {
					System.out.println("f");
				} else {
					System.out.println("오류");
				}
			}
		}

		scanner.close();
	}
}
