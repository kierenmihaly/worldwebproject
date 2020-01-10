package day02;
//조건문 6 - switch문
//스위치문은 조건식을 넣는게 아니라
//변수를 하나 선택해서
//해당 변수의 나올 수 있는 값들을 
//하나하나 해야할 행동을 정해주는 형식이다. 
//100살까지하면 100세까지 입력해줘야하니 한정적임 
public class ex06 {
	public static void main(String[] args) {
		int age = 1;
		switch(age) {
		case 1:
			System.out.println("1age");
		case 2:
			System.out.println("2age");
			break;
		case 3:
			System.out.println("3age");
			break;
		default:
			System.out.println("그외의 경우입니다");
			break;
		}
	}
}
