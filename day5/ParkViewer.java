package day5;
//��� Viewer�� 

//jsp �Ǵ� html ���������� �Ǿ�� �Ѵ�
//������ �츮�� ���� ���α׷��̱� ������
//���� �޼ҵ尡 ����� ���� �ȴ� 

import java.util.ArrayList;
import java.util.Scanner;

public class ParkViewer {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<ParkDTO> list = new ArrayList<>();
		ParkController controller = new ParkController(list);
		while (true) {
			System.out.println("���� ������ ���� ���α׷�");
			System.out.println("1. ���� 2. ���� 2. ����");
			int choise = scanner.nextInt();
			if (choise == 1) {
				// ���� ����
				// 1. ��ĭ�� �ִ� �� Ȯ���Ѵ�
				if (controller.checkEmptySpot()) {
					// ��ĭ�� �����Ƿ� ���� ����
					// ������ȣ�� �ð��� ����
					// �ӽ� ��ü �ϳ� ����� �ش�
					ParkDTO p = new ParkDTO();
					//�츮�� ����� ��ü��
					//�ʿ��� �� ������ָ� �ȴ�
					System.out.println("���� ��ȣ �Է�: ");
					scanner.nextLine();
					p.setPlateNumber(scanner.nextLine());
					while(controller.indexOf(p) != -1) {
						System.out.println("�ߺ��� ��ȣ");
						System.out.println("���� ��ȣ �Է�:");
						p.setPlateNumber(scanner.nextLine());
					}
					System.out.println("���� �ð� �Է�: ");
					int inTime = scanner.nextInt();
					while(controller.validateTime(inTime) == false) {
						System.out.println("�߸��� ����");
						System.out.println("���� �ð� �Է�: ");
						inTime = scanner.nextInt();
					}
					p.setInTime(inTime);
					controller.add(p);
					System.out.println("������ �Ϸ�");
				} else {
					// �����ϱ� �޼��� ���
					System.out.println("There are not enough place");
				}
			} else if (choise == 2) {
				// ���� ����
			} else if (choise == 3) {
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("�߸�");
			}
		}

		scanner.close();
	}
}
