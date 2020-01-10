package day02;
//조건문03 - if else if else구조
//만약 조건을 여러 경우로 봐야한다면?
//if - else if - else
//가 나와서 각각의 조건을 체크해줄 수 있다.
//물론 else if 는 여러개가 나올 수도 있다.

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
