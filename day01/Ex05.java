package day01;
//������03 - �񱳿�����
// > ,  >= ,  <  , <= ,  == , !=
public class Ex05 {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 15;
		System.out.println(number1 > number2);
		System.out.println(number1 >= number2);
		System.out.println(number1 < number2);
		System.out.println(number1 <= number2);
		System.out.println(number1 == number2);
		System.out.println(number1 != number2);
		//������ �񱳿����� �߿��� ==�� != �� Ŭ������ ����(��ü)�� ����ϸ� ��Ȯ�� ���� 
		//�� �������� �ִ�.
		
		//String�̶� ���ڿ��� ���Ѵ�. (�������� ���ڰ� ������)
		String string1 = "abc";
		String string2 = new String("abc");
		System.out.println(string1);
		System.out.println(string2);
		
		//==�� �Ἥ ��ü�� ���ϸ� ��Ʈ�� ��ü�� ���ڿ� ���� �ƴ�
		//�ش� ��ü���� �ּҰ��� ���ϰ� �ȴ�.
		System.out.println(string1 == string2);
		//Ŭ���� ��ü�� ���� ������
		//�ش� Ŭ������ ���ǵǾ� �ִ� equals��� �޼ҵ带 ���ؼ� ���Ͽ��� �Ѵ�.
		//��ü�� ������ ���ǵǾ� �ִ� �޼ҵ带 ������ ������
		//��ü �޼ҵ� �̸����� ������ �ؾ��Ѵ�.
		System.out.println(string1.equals(string2));
	}
}
