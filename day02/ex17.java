package day02;

//���� ������ �̿��ؼ� �޴��� ������
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
			System.out.printf("%-5s%8s%8s\n", "|", "��Ʈ�������α׷�", "|");
			System.out.println("=====================");
			System.out.println("1. �Է�  2. ���  3. ����");
			int choice = scanner.nextInt();
			if (choice == 1) {
				System.out.println("�л��� ��ȣ�� �Է��ϼ���: ");
				number = scanner.nextInt();
				scanner.nextLine();
				System.out.println("�л��� �̸��� �Է��ϼ���: ");
				name = scanner.nextLine();
				System.out.println("�л� ����: ");
				age = scanner.nextInt();
				System.out.println("�л��� ��������: ");
				kor = scanner.nextInt();
				System.out.println("�л��� ��������: ");
				eng = scanner.nextInt();
				System.out.println("�л��� ��������: ");
				math = scanner.nextInt();

			} else if (choice == 2) {
				if (name.contentEquals("")) {
					System.out.println("�Էµ� ������ ����.");
				} else {
					System.out.printf("%-2d��. %5s %-3d��" + "%03d�� %03d�� %03d�� %03d�� %.2f��\n ", number, name, age, kor,
							eng, math, (kor + eng + math), (kor + eng + math) / 3.0);
				}
			} else if (choice == 3) {
				System.out.println("������ּż� ����");
				break;

			}
		}
		scanner.close();
	}
}