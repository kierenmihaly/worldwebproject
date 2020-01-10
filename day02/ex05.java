package day02;

//연도를 입력 받아 윤년인지 평년인지 출력하는 프로그램
//윤년의 조건1. 4로 나눠 떨어진다
//윤년의 조건2. 400으로 나눠 떨어진다.
//윤년의 조건3. 4로 나눠 떨어지지만 100으로는 나눠떨어지지 않는다.
import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("연도를 입력하세요");
		int year = scanner.nextInt();
		if (year % 4 == 0) {
			// 100으로 나눠떨어지는지 체크한다.
			if (year % 100 == 0) {
				// 400으로 나눠 떨어지는지 다시 체크
				if (year % 400 == 0) {
					System.out.println("윤년입니다.");
				} else {
					System.out.println("평년입니다");
				}
			} else {
				System.out.println("윤년입니다");
			}
		} else {
			System.out.println("평년입니다.");
		}

		// 1. 400으로 나눠떨어진다.
		// 2. 4로 나눠떨어지고 100으로 안 나눠떨어진다
		if ((year % 400 == 0) || (year % 4 == 0 && year % 4 != 0)) {
			System.out.println("윤년입니다.");

		} else {
			System.out.println("평년입니다");
		}
		scanner.close();
	}
}

//코드블락의 특징이 뭐가? 코드들이 정렬이 안되어있으면 
//헷갈릴 수 있는데 컨트롤씨프트 에프를 누르면 자동 정렬을 해준다!!
//if문은 여기까지하고 다음엔 switch문을 배워볼꺼당 