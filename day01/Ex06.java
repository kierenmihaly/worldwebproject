package day01;
//연산자04 - 논리연산자
//&& || !
//&&: AND 연산자
//||: OR 연산자 
//!: 부정 연산자
public class Ex06 {
	public static void main(String[] args) {
		//논리 연산자는 2개의 boolean에 대해서 연산을 한다
		//&&: 2개다 true일때만 true
		//!!: 2개중 하나만 true여도 true
		//!: true는 false로 false는 true로
		
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
