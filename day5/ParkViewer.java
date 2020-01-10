package day5;
//��� Viewer�� 

//jsp �Ǵ� html ���������� �Ǿ�� �Ѵ�
//������ �츮�� ���� ���α׷��̱� ������
//���� �޼ҵ尡 ����� ���� �ȴ� 

import java.util.ArrayList;
import java.util.Scanner;

public class ParkViewer {
	private static final int SIZE = 5;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<ParkDTO> list = new ArrayList<>();
		ParkController controller = new ParkController(list);
		while (true) {
			System.out.println("���� ������ ���� ���α׷�");
			System.out.println("1. ���� 2. ���� 3. ����");
			int choise = scanner.nextInt();
			if (choise == 1) {
				// ���� ����
				// 1. ��ĭ�� �ִ� �� Ȯ���Ѵ�
				if (controller.size() < SIZE) {
					// ��ĭ�� �����Ƿ� ���� ����
					// ������ȣ�� �ð��� ����
					// �ӽ� ��ü �ϳ� ����� �ش�
					ParkDTO p = new ParkDTO();
					// �츮�� ����� ��ü��
					// �ʿ��� �� ������ָ� �ȴ�
					System.out.println("���� ��ȣ �Է�: ");
					scanner.nextLine();
					p.setPlateNumber(scanner.nextLine());
					while (controller.indexOf(p) != -1) {
						System.out.println("�ߺ��� ��ȣ");
						System.out.println("���� ��ȣ �Է�:");
						p.setPlateNumber(scanner.nextLine());
					}
					System.out.println("���� �ð� �Է�: ");
					int inTime = scanner.nextInt();
					while (controller.validateTime(inTime) == false) {
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
				// ��������
				//���� ���� ������ ������ �����ϴ���
				//üũ�ϰ� ������ �޽����� ���� 
				if(controller.size() == 0) {
					System.out.println("������ ������ ���� �ù߳��");
				}else {
					//������ ������ �����ϹǷ�
					//���� ����
					//���� ���� ��ȣ�� �Է¹޾Ƽ�
					//ParkDTO ��ü�� �־
					//�ش��ϴ� ��ü�� ��ġ�� -1����
					//�ƴ��� Ȯ���Ѵ�.
					//�ֳ�! -1 �̸� list�� �������� 
					//�ʴ� �ǹ��̱� ������
					//�ٽ� �Է��� �޾ƾ� �ϱ� �����̴�. 
					scanner.nextLine();
					System.out.println("������ ������ ��ȣ�� �Է�: ");
					ParkDTO p = new ParkDTO();
					p.setPlateNumber(scanner.nextLine());
					while(controller.indexOf(p) == -1) {
						System.out.println("�������� �ʴ� ��ȣ");
						System.out.println("������ ���� ��ȣ �Է�: ");
						p.setPlateNumber(scanner.nextLine());
					}
					
					//while ���� �������Դ� -> �ش��ϴ� ������ ã�Ҵ�!
					//�׷��� indexOf(p) �� ���������
					//p �� �ʱ�ȭ ���ָ�?
					//list �� ����Ǿ��ִ� inTime�� �츮�� �� �� �ִ�! 
					p = controller.selectOne(controller.indexOf(p));
					//���� p�� inTime�� �����ϱ�
					//�����ð��� �Է� �޾Ƽ�
					//��ȿ�� �ð��� ���� + inTime���� �����ð���
					//���ö�����
					//while���� �����ش�! 
					System.out.println("���� �ð��� �Է�");
					int outTime = scanner.nextInt();
					while(!controller.validateTime(outTime) || p.getInTime() > outTime) {
						System.out.println("�ð� ����");
						System.out.println("���� �ð��Է�: ");
						outTime = scanner.nextInt();
					}
					
					//���� ��� ��� ����� ����ϰ�
					//������ �������ش�! 
					System.out.println("�� �����" + controller.calculateRate(p.getInTime(), outTime) + "�� �Դϴ�");
					controller.remove(p);
					
				}
			} else if (choise == 3) {
				System.out.println("�����մϴ�");
				break;
			} else {
				System.out.println("����");
			}
		}

		scanner.close();
	}
}
