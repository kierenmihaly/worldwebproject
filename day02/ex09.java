package day02;
//���׿�����
//�ӵ��� ���� �������� �ڵ带 �����ϴ� �뵵�� ����� �� ����
//��� ������� �Ҵ��ϴµ� ���Ǿ�����

//���� �������� ���� ������ ������ �ӵ����̰� �� �ȳ���������
//���� ó���� �ȴ�. 
public class ex09 {
	public static void main(String[] args) {
		//���׿����ڴ�
		//���ǽ�? ���϶� �� : �����϶� ��
		int age = 17;
		//age > 18 ?  System.out.println("Adult") : System.out.println("Teen");
		String result = age > 18? "Adult" : age > 13 ? "middle": "Teen";
		System.out.println(result);
	}
}
