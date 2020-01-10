package day02;
//사용자로부터 숫자를 입력받아서
//팩토리얼을 구하는 프로그램을 작성하세요
//팩토리얼이란? 1~ 해당숫자까지의 곱
import java.util.Scanner;

public class ex12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int facto = 1;
		System.out.println("숫자를 입력해주세요:");
		int number = scanner.nextInt();
		
		for (int i = 1; i <= number; i++) {
			// sum = sum + i;
			// 산술연산자의 경우 자기 자신의 값에 사칙연산을 하는 경우
			// 아래의 코드처럼 줄여줄수 있다.
			facto *= i;

		}
		System.out.println(facto);
		scanner.close();
	}
}


//이중포문 다중포문 while문 점수를 계속 받을 수 있는 프로그램 