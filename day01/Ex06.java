package day01;
//������04 - ��������
//&& || !
//&&: AND ������
//||: OR ������ 
//!: ���� ������
public class Ex06 {
	public static void main(String[] args) {
		//�� �����ڴ� 2���� boolean�� ���ؼ� ������ �Ѵ�
		//&&: 2���� true�϶��� true
		//!!: 2���� �ϳ��� true���� true
		//!: true�� false�� false�� true��
		
		boolean boolean1 = true;
		boolean boolean2 = true;
		System.out.println(boolean1 && boolean2);
		System.out.println(boolean1 || boolean2);
		boolean1 = true;
		boolean2 = false;
		System.out.println(boolean1 && boolean2);
		System.out.println(boolean1 || boolean2);
		boolean1 = false;
		boolean2 = false;
		System.out.println(boolean1 && boolean2);
		System.out.println(boolean1 || boolean2);
		
		System.out.println(!boolean1);
	}
}
