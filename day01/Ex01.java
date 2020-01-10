package day01;
//주석 ( Comment ) 
//주석이란 우리가 코드에 설명을 적는 칸으로서
//앞에 // 를 붙여준다
//그러면 해당 줄은 실제 컴파일 단계에서 무시가 된다
//여러 줄을 주석으로 만들때에는
// /*로 시작해서 */로 끝낸다.
/*
 이렇게
 */

//자바에는 2가지 종류의 자료형 data type이 있다.
//기본형과 참조형이 있다

//기본형은 해당 주소에 값이 저장되어 있는 형태 -> 스택 영역
//참조형은 해당 주소에 값이 아니라, 값들이 저장되어 있는 주소로 갈 수 있는
//주소값이 저장되어 있다. -> 힙 영역

//기본형에는 8가지 자료형이 있다.
//byte short int long float double char boolean
//byte, short , int , long : 정수형 데이터 타입
//8비트	16비트      32비트    64비트
//float, double : 실수형 데이터 파일
//자릿수가 적은 실수 , 자릿수가 큰 실수
//char:문자형 데이터타입
//문자 1개
//boolean: 참/거짓 데이터타입
//true/false

//변수란? 해당 공간의 값이 바뀔 수 있는 공간을 뜻한다.
//변수를 선언할 때에는 해당 공간의 종류 공간의 이름을 써주면 된다.
//ex) int number;
//변수는 선언과 초기화를 해줘야한다.
//위의 ex는 선언이고 값을 초기화 할때에는 number = 값;으로 해주면 된다

public class Ex01 {
	public static void main(String[] args) {
		int number;
		number = 5;
		System.out.println(number);
		number = 10;
		System.out.println(number);
		//선언과 초기화는 한줄로도 해줄 수 있다.
		int number2 = 20;
		System.out.println(number2);
		
		//자료형을 내가 원하는 자료형으로 바꿔 줄 수 있다.
		//이러한것을 형변환(type casting)이라고 한다.
		
		//형변환에느 2가지가 있다.
		//암시적 형변환(implicit type casting)과
		//명시적 형변환(explicit type casting)이 있다.
		
		//암시적 형변환은 더 작은 데이터타입의 값을 더 큰 데이터타입으로 
		//옮길때 실행된다.
		number = 100;
		long myLong = number;
		//롱이 더 큰 데이터타입이기 때문에 굳이 number를 롱으로 바꾸라고 명시해줄 필요가 없다.
		
		//명시적 형변환은 더 큰 데이터타입의 값을 더 작은 데이터타입으로 
		//변환할때 실행된다
		//명시적 형변환은 (바꿀 데이터타입)값  으로 해주게 된다.
		
		//byte myByte = number; 에러가 난다
		byte myByte = (byte)number; //에러가 난다
		myByte = (byte)128;
		System.out.println(myByte);
		myByte = (byte)-129;
		System.out.println(myByte);

	}
}





















