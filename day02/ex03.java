package day02;
//���ǹ�03 - if else if else����
//���� ������ ���� ���� �����Ѵٸ�?
//if - else if - else
//�� ���ͼ� ������ ������ üũ���� �� �ִ�.
//���� else if �� �������� ���� ���� �ִ�.

public class ex03 {
	public static void main(String[] args) {
		int age = 8;
		if(age < 8) {
			System.out.println("Kindergathen");
		}else if(age < 13) {
			System.out.println("Elementary");
		}else if(age < 17) {
			System.out.println("Middle");
		}else if(age < 19) {
			System.out.println("Highschool");
		}else {
			System.out.println("University");
		}
	}
}
