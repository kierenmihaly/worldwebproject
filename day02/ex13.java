package day02;
//�ݺ��� - ���� for loop
//���� for loop�� ���
//�ٱ��� for loop�� 1�� �� ����
//���� for loop�� ó������ ������ �� ����.

public class ex13 {
	public static void main(String[] args) {
		//char ��
		//ascii ���̺��� �ڵ尪�� ��ġ�ϴ� ���ڸ� �����ش�.
		//���� ��� 65�� 'A'��� ���ڰ� ������ �ȴ�.
		for(int i = 0; i < 6; i++) {
			char xPosition = (char)(65+i);
			for(int j = 1; j < 6; j++) {
				System.out.println("����: "+xPosition + "����: "+ j);
			}
		}
		for(int i =0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("o");
			}
			System.out.println();
			//�ٹٲ�
		}
	}
}
