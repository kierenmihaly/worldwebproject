package day4;

import java.util.Random;

//�ζǹ�ȣ �����ϴ� ���α׷� - 1�ܰ� �迭 �� ������ ��� 
public class ex03 {
	private static final int SIZE = 6;
	private static final int MAX = 45;

	public static void main(String[] args) {
		// ���� ���� �߻��� ���ؼ�
		// randomŬ���� ��ü�� ������ش�.
		Random random = new Random();
		// ��Ʈ�� �����̽� ������ ��� �ۼ�����? �����ش�

		// �ζ� ��ȣ�� ������ �迭�� ������ش�.
		int[] lottoNumbers = new int[6];
		System.out.println(lottoNumbers.length);
		//������6���� �״�� ��µȴ� 
		
		// �迭�� �̿��ؼ�
		// lottoNumber�� ������ 1���� �־��ش�
		for (int i = 0; i < lottoNumbers.length; i++) {
			// ���� �Լ��� ���
			// 0~�Ķ���ͷ� �� ���� -1 ������
			// ������ ���´�.
			// �׷� 1~�Ķ���ͷ� �� ���ڱ���
			// ������ �ҷ���
			// ��� �ؾ��ұ�?
			// �޼ҵ� ����� + 1�� ���ָ� �ȴ�!
			lottoNumbers[i] = random.nextInt(MAX) + 1;
		}
		// ���� ���⼭�� �ߺ��� ���ŵ��� �ʾұ� ������
		// �ߺ� ���ź��� ����� �Ѵ�.
		// ������ �迭�� �ߺ� ���Ÿ� �ҷ���?
		// ������ ����� ����Ѵ�.
		System.out.println("�ߺ�������");
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.println(lottoNumbers[i]);
		}
		for (int i = 0; i < lottoNumbers.length; i++) {
			for (int j = 0; j < lottoNumbers.length; j++) {
				if (i != j && lottoNumbers[i] == lottoNumbers[j]) {
					lottoNumbers[i] = random.nextInt(MAX) + 1;
					j = -1;
					// i�� j�� ��ġ�� �ȵ�
					// i�� j�� �ٸ��� �� �ε����� �� ������ ������ �ߺ��̶� ��
					// �׷��� i ��° ���� �ؽ�Ʈ��Ʈ�� �־��ְ� j�� -1�� ��������
				}
			}
		}
		System.out.println("���� ��");
		//���ĵ� ��������
		//�ߺ�����ó��
		//������ġ ���� ��ġ ���ϰ�
		//���� ������ġ�� �� ũ��?
		//�׷��� ������ �ٲ��ְ� �ε����� -1�� �����ش�.
		for(int i = 0; i < lottoNumbers.length -1;i++) {
			if(lottoNumbers[i] > lottoNumbers[i+1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i] = lottoNumbers[i+1];
				lottoNumbers[i+1] = temp;
				i = -1;
			}
		}
		
		System.out.println("�ߺ� ������");
		System.out.println("���");
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.println(lottoNumbers[i]);
		}
	}
}
