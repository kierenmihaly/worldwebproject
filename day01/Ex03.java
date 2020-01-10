package day01;
//연산자01 - 산술 연산자
//연산자란? 변수의 값을 이용하여 계산하는 특수문자들을 연산자라고 한다.
//산술 연산자는 + - * / % 5가지가 있다.

public class Ex03 {
	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 4;
		System.out.println(number1 + number2);
		System.out.println(number1 - number2);
		System.out.println(number1 * number2);
		System.out.println(number1 / number2);
		System.out.println(number1 % number2);
		
		//정수의 나눗셈 결과값을 실수로 바꿔보자
		double number3 = number1 / number2;
		System.out.println(number3);
		//위의 코드는 2.0이 나온다 왜냐하면 number과/number2의 결과값인 2를 double로 바꿔서
		//2.0이 되기 때문.
		
		//우리가 원하는 2.5라는 값을 계산하려면
		//정수/실수 or 실수/정수 를 실행해야한다.
		number3 = (double)number1/number2;
		System.out.println(number3);
		number3 = number1/(double)number2;
		System.out.println(number3);
		number3 = (double)number1/(double)number2;
		System.out.println(number3);
		
	}
}
