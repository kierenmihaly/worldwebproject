package day01;
//연산자05 - 비트연산자
//비트연산자는 비트(2진법 숫자)에 대한 연산을 한다.
//&,|,^,!,<<,>>

//& : AND연산 -> 두 이진법 숫자의 같은 자릿수가 1이면 1 아니면 0
//| : OR연산 -> 두 이진법 숫자의 자릿수가 하나라도 1이면 1 둘다 0이면 0
//^ : XOR연산 - > 두 이진법 숫자의 같은 자리가 다르면 1 같으면 0
//~ : 반전연산 - > 1은0으로 0은1로
//<<: 왼쪽 쉬프트 연산 - > 자릿수를 오른쪽 숫자만큼 왼쪽으로 이동한다
//>>: 오른쪽 쉬프트 연산-> 자릿수를 오른쪽 숫자만큼 오른쪽으로 이동한다


public class Ex07 {
	public static void main(String[] args) {
		byte byte1 = 5; //00000101
		byte byte2 = 6; //00000110

		//&:            //00000100 -> 4
		//|:            //00000111 -> 7
		//^:            //00000011 -> 3
		//~:            //byte1:00000101   ~byte1: 11111010
						//->11111010 = 
						//10000000 + 01111010 
		                // = -128 + 2 + 8 + 16 + 32 + 64
		//byte1<<2
		//왼쪽 쉬프트 연산자의 경우에는 오른쪽에 나와있는 숫자만큼 뒤에 0을 붙여주고
		//앞에 자릿수를 잘라내서 자릿수를 맞춘다.
		//00010100 -> 20
		
		//byte1>>2
		//는 00000001
		System.out.println((byte)byte1 & byte2);
		System.out.println((byte)byte1 | byte2);
		System.out.println((byte)byte1 ^ byte2);
		System.out.println((byte)~byte1);
		System.out.println((byte)byte1<<2);
		System.out.println((byte)byte1>>2);
		
		byte1 = -128;
		//byte1 >> 2
		//byte1 = 10000000
		//>>연산을 할 경우 11100000이 된다.
		System.out.println((byte)byte1>>2);
		
	
	
	}
}
