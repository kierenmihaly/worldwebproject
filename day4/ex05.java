package day4;

import java.util.ArrayList;
import java.util.Collections;
//�ζ� ��ȣ ���۱� 2ź - ArrayList�� �� ������ ���
import java.util.Random;

public class ex05 {
	private static final int MAX = 45;
	private static final int SIZE = 6;

	public static void main(String[] args) {
		ArrayList<Integer> lottoNumbers = new ArrayList<>();
		Random random = new Random();

		// ���� ���� 6���� �߰�������
		// �ٵ� �߰��� �� ���� indexOf�� �̸� üũ�� �Ѵ�.
		// �׸��� �߰��� while���� ���ؼ� �Ѵ�.
		while (lottoNumbers.size() < 6) {
			Integer number = random.nextInt(MAX) + 1;
			if (lottoNumbers.indexOf(number) == -1) {
				lottoNumbers.add(number);
			}
		}
		
		//������ �غ���
		//�ٵ� �� ������ �츮�� �ؾߵ�
		//�ڹ��� ������ �̿�����
		Collections.sort(lottoNumbers);
		
		//�ߺ����� �Ϸ�, ���� ��
		for(int i = 0; i < lottoNumbers.size(); i++) {
			System.out.println(lottoNumbers.get(i));
		}
	}

}
