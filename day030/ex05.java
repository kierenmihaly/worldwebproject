package day030;

import java.util.Scanner;

public class ex05 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("����� 5��");
		System.out.print("����� �� ���� �Է��ϼ���: ");
		int userNumber = scanner.nextInt();
//ù���� ���� �����ѹ� - 1, �ι�°�� �����ѹ� -2 
		for (int i = 1; i <= userNumber; i++) {
			String stars = "";
			for (int j = i; j <= userNumber - 1; j++) {
				stars += " ";
			}
			for (int j = 1; j <= 2 * i - 1; j++) {
				stars += "*";
			}
			System.out.println(stars);
		}
		scanner.close();
	}
}
