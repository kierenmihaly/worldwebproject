package day02;
//반복문 - for loop
//반복문이란?
//조건을 만족하는 동안 코드 블락을 반복시키는 문 
//for loop과 while loop이 있다. 
//for(int i = 시작할 숫자; 종료조건; i변화식){
//		반복할 코드
//}
public class ex10 {
	public static void main(String[] args) {
		for(int i = 1; i < 5; i++) {
			//i에 1이들어가고 그다음에 5보다작은지 체크  그다음에 
			//아래로 내려가서 1을 더해줌 끝나고나면 i++
			System.out.println("i: "+i);
		}
	}
}
