package day01;
//사용자로부터
//학생번호, 이름, 국어, 영어, 수학 점수를 입력받아서
//출력하는 프로그램을 작성하세요
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학생번호: ");
		int studentNumber = scanner.nextInt();
		scanner.nextLine();
		System.out.println("학생이름: ");
		String studentName = scanner.nextLine();
		
		System.out.println("국어: ");
		int korean = scanner.nextInt();
		System.out.println("영어: ");
		int english = scanner.nextInt();
		System.out.println("수학: ");
		int math = scanner.nextInt();
		
		System.out.println("회원번호: " + studentNumber);
		System.out.println("회원이름: " + studentName);
		System.out.println("국어: " + korean);
		System.out.println("영어: " + english);
		System.out.println("수학: " + math);
	
		scanner.close();
	}

}
