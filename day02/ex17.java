package day02;

//무한 루프를 이용해서 메뉴를 만들어보자
import java.util.Scanner;

public class ex17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int number = 0;
		String name = "";
		int age = 0;
		int kor = 0;
		int eng = 0;
		int math = 0;

		while (true) {
			System.out.println("=====================");
			System.out.printf("%-5s%8s%8s\n", "|", "비트성적프로그램", "|");
			System.out.println("=====================");
			System.out.println("1. 입력  2. 출력  3. 종료");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("학생의 번호를 입력하세요: ");
				number = scanner.nextInt();
				scanner.nextLine();
				System.out.println("학생의 이름을 입력하세요: ");
				name = scanner.nextLine();
				System.out.println("학생 나이: ");
				age = scanner.nextInt();
				System.out.println("학생의 국어점수: ");
				kor = scanner.nextInt();
				System.out.println("학생의 영어점수: ");
				eng = scanner.nextInt();
				System.out.println("학생의 수학점수: ");
				math = scanner.nextInt();

			} else if (choice == 2) {
				if (name.contentEquals("")) {
					System.out.println("입력된 정보가 없다.");
				} else {
					System.out.printf("%-2d번. %5s %-3d세" + "%03d점 %03d점 %03d점 %03d점 %.2f점\n ", number, name, age, kor,
							eng, math, (kor + eng + math), (kor + eng + math) / 3.0);
				}
			} else if (choice == 3) {
				System.out.println("사용해주셔서 감사");
				break;

			}
		}
		scanner.close();
	}
}