package day01;
//연산자03 - 비교연산자
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
		//하지만 비교연산자 중에서 ==와 != 는 클래스의 변수(객체)로 사용하면 정확한 값을 
		//못 얻을수도 있다.
		
		//String이란 문자열을 뜻한다. (여러개의 문자가 모여있음)
		String string1 = "abc";
		String string2 = new String("abc");
		System.out.println(string1);
		System.out.println(string2);
		
		//==을 써서 객체를 비교하면 스트링 객체의 문자열 값이 아닌
		//해당 객체들의 주소값을 비교하게 된다.
		System.out.println(string1 == string2);
		//클래스 객체를 비교할 때에는
		//해당 클래스에 정의되어 있는 equals라는 메소드를 통해서 비교하여야 한다.
		//객체의 내부의 정의되어 있는 메소드를 접근할 때에는
		//객체 메소드 이름으로 접근을 해야한다.
		System.out.println(string1.equals(string2));
	}
}
