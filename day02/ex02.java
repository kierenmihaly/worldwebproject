package day02;
//조건문 02- if else 구조
//우리가 if문의 조건을 만족하지 않을 경우에 
//실행할 코드가 있으면?
//else를 만들어줘서 
//if문 조건을 만족하지 않는 모든 경우는 해당 
//else문의 코드 블락이 실행되게 만들어 줄 수 있습니다.
public class ex02 {
	public static void main(String[] args) {
		int age = 15;
		if(age >= 18) {
			System.out.println("성인");
		}else {
			System.out.println("미성년");
		}
	}
}
