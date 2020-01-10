package day02;
//조건문01 - if문
//if문은 특정 조건이 만족할 때 해당 코드 블락을 실행한다. 
//코드 블락이란 중괄호 {}사이의 모든 줄을 뜻한다.
//if문은 
//if(조건식) {
//	실행할 코드 
//} 요렇게 생겼따.
public class ex01 {
	public static void main(String[] args) {
		int age = 25;
		if(age < 18) {
			//변수의 유효범위(scopㄷ, life cycle)
			//변수는 해당 변수가 선언된 코드 블락아래에서만 
			//유효하다.
			//만약 이 if문 안에 변수를 선언하면
			//해당 변수는 if문 안에서만 사용 가능하다!
			int score = 30;
			System.out.println("미성년자입니다.");
		}
	}
}
