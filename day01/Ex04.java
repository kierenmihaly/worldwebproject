package day01;
//연산자 02 - 증감연산자
//증감연산자는 변수의 현재값을 1씩 증가시키거나 감소시킨다.
//증감연산자는 전위연산과 후위연산이 있다.

//++, --
public class Ex04 {
	public static void main(String[] args) {
		int number = 5;
		System.out.println(number++);
	//++가 뒤에 붙으면 후위 연산자가 된다. 후위연산자는 해당줄에서 실행순서가 가장 마지막이 된다.
	//즉 Syste,.out.println(number++)의 의미는
    //number의 현자값을 출력하고 출력뒤에 number에 현재값 +1(출력후에 +1)
		System.out.println(number);
		System.out.println(++number);
	//++가 앞에 붙으면 전위 연산자가 된다. Sytem.out.println(++number)의 의미는
	//number에 +1을 하고나서 출력한다.	
		System.out.println(number);
	}
}
