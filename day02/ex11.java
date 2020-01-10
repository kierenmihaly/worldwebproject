package day02;

//사용자로부터 입력을 받아서
//1~그숫자까지의 합을 구하는 프로그램을 작성하세요.
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요:");
		int number = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			// sum = sum + i;
			// 산술연산자의 경우 자기 자신의 값에 사칙연산을 하는 경우
			// 아래의 코드처럼 줄여줄수 있다.
			sum += i;

		}
		System.out.println(sum);
		scanner.close();
	}
}
