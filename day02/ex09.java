package day02;
//삼항연산자
//속도가 제일 빠르지만 코드를 실행하는 용도를 사용할 수 없다
//대신 결과값을 할당하는데 사용되어진다

//삼항 연산자의 장점 빠르다 요즘은 속도차이가 얼마 안나긴하지만
//빨리 처리가 된다. 
public class ex09 {
	public static void main(String[] args) {
		//삼항연산자는
		//조건식? 참일때 값 : 거짓일때 값
		int age = 17;
		//age > 18 ?  System.out.println("Adult") : System.out.println("Teen");
		String result = age > 18? "Adult" : age > 13 ? "middle": "Teen";
		System.out.println(result);
	}
}
