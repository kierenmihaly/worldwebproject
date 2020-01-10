package day02;
//반복문 - 다중 for loop
//다중 for loop의 경우
//바깥쪽 for loop이 1번 돌 동안
//안쪽 for loop은 처음부터 끝까지 다 돈다.

public class ex13 {
	public static void main(String[] args) {
		//char 는
		//ascii 테이블의 코드값과 일치하는 문자를 보여준다.
		//예를 들어 65는 'A'라는 글자가 나오게 된다.
		for(int i = 0; i < 6; i++) {
			char xPosition = (char)(65+i);
			for(int j = 1; j < 6; j++) {
				System.out.println("가로: "+xPosition + "세로: "+ j);
			}
		}
		for(int i =0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("o");
			}
			System.out.println();
			//줄바꿈
		}
	}
}
