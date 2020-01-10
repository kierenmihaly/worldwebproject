package day02;
//출력
//자바에는 3가지 출력 method가 있다
//print, printf, println
//print; 괄호안의 내용을 출력하고 커서는 옮기지 않는다.
//printf; 괄호안의 내용을 형식화해서 출력한다.
//println; 괄호안의 내용을 출력하고 커서를 다음줄로 옮긴다.
public class ex15 {
	public static void main(String[] args) {
		System.out.print("abc");
		System.out.print("def");	
		
		System.out.println("abc");
		System.out.println("def");
		
		//printf는 print in format의 줄임말로써
		//%문자를 사용해서 해당 %문자와 데이터타입이 일치하는 
		//내용을 출력한다!
		//%문자는 단순히 어떤 데이터타입을 
		//출력할지만 정해주는 것이 아니라
		//해당 데이터타입의 형식을 정해줄 수 있다.
		
		//1. 10진법 숫자
		//A) 내용을 그대로 출력해라
		System.out.printf("1-A. %d %d %d\n", 25, 35, 45);
		
		//B) 숫자를 자릿수를 맞춰서 출력해라
		// -> %5d라고 입력하면 총 5칸의 공간만큼 출력한다
		System.out.printf("1-B. %5d %5d %5d\n", 25, 35, 45);
		
		//C) 숫자를 자릿수를 맞추고 왼쪽의 빈칸을 0으로 채워라
		// -> %05d라고 입력하면 왼쪽에 빈 공간을 0으로 채워서 출력 해!
		System.out.printf("1-C. %05d %05d\n", 25, 35);
		//D) 숫자를 자릿수를 맞추고 왼쪽정렬해서 출력해라!
		System.out.printf("1-D %-5d %-5d\n", 25, 35);
		
		//2. 16진법 표기하기(%x)
		//A) 16진법을 소문자로 표기해라! 
		System.out.printf("2-A. %x\n", 27);
		
		//B) 16진법을 대문자로 표기해라
		System.out.printf("2-B. %X\n", 27);
		//C) 16진법을 8자리 대문자로 표기하고 왼쪽은 0으로 채워라 
		System.out.printf("2-B. %08X\n", 27);
		
		//3. 실수(%f)
		//A) 실수를 표기해라 
		System.out.printf("3-A. %f\n", 3.141592);
		//B) 소숫점 3번째자리까지 표기해라 
		System.out.printf("3-B. %.3f\n", 3.141592);
		//C) 총 8자리를 출력하고 그중 소수점 3자리까지 출력해라!
		System.out.printf("3-C. %8.2f\n", 3.141592);
		//D) 로그지수로 출력해라
		System.out.printf("3-D. %8e\n", 892.0);
		
		
		//자바에서는 ""와 ''는 다른 데이터타입
		//''는 char(기본형 데이터타입)
		//""는 String(참조형 데이터타입 )
		
		//4. 문자 출력하기
		//A) 문자 1개를 그대로 출력해라 
		System.out.printf("4-A. %c\n", 'j');
		//B) 문자 1개를 대문자로 출력해라 
		System.out.printf("4-B. %C\n", 'j');
		
		//5.문자열 출력하기 
		//문자열 = String
		//A) 문자열을 그대로 출력해라
		System.out.printf("5-A. %s\n", "AbCdEf");
		//B)) 문자열을 대문자로 바꿔서 출력해라 
		System.out.printf("5-B. %S\n", "AbCdEf");
		
		//printf의 %문자를 조합해서
		//학생의 번호. 이름 나이 국영수점수 총점 평균을 출력해보자
		//번호는 2자리 왼쪽정렬로 고정
		//이름은 5자리 고정
		//나이는 3자리 왼쪽정렬로 고정 
		//국어, 영어, 수학, 총점은 3자리 오른쪽 정렬하고 왼쪽 빈자리는 0으로 
		//평균은 소숫점 2자리까지 
		
		System.out.printf("%-2d번. %5s %-3d세"
				+ "%03d점 %03d점 %03d점 %03d점 %.2f점\n ",
				1, "김성근", 19, 80, 81, 92, (80+81+92),
				(80+81+92) / 3.0);
	}

}
