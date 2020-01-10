package day02;
//사용자로부터 점수를 입력을 받아서
//a b c d e 를 출력하는 프로그램을 작성하세요 
import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int score = scanner.nextInt();
		//조건식 안에 AND 논리연산자를 통해서
		//마지막 결과가 true일때만 실행이 된다.
		// if(score <= 100 && score >= 90) 으로 해줘야함 // (100 >= scroe >= 90) 이건 안됨 
		if(score <= 100 && score >= 90) {
			System.out.println("a");
		}else if(score < 90 && score >= 80) {
			System.out.println("b");
		}else if(score < 80 && score >= 70) {
			System.out.println("c");
		}else if(score < 70 && score >= 60) {
			System.out.println("d");
		}else if(score < 60 && score >= 0) {
			System.out.println("e");
		}else {
			System.out.println("오류");
		}

		scanner.close();

		}
	}
