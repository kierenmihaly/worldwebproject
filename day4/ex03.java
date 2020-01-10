package day4;

import java.util.Random;

//로또번호 제작하는 프로그램 - 1단계 배열 쓴 무식한 방법 
public class ex03 {
	private static final int SIZE = 6;
	private static final int MAX = 45;

	public static void main(String[] args) {
		// 먼저 난수 발생을 위해서
		// random클래스 객체를 만들어준다.
		Random random = new Random();
		// 컨트롤 스페이스 누르면 어떤걸 작성할지? 보여준다

		// 로또 번호를 저장할 배열을 만들어준다.
		int[] lottoNumbers = new int[6];
		System.out.println(lottoNumbers.length);
		//사이즈6개가 그대로 출력된다 
		
		// 배열을 이용해서
		// lottoNumber에 난수를 1개씩 넣어준다
		for (int i = 0; i < lottoNumbers.length; i++) {
			// 랜덤 함수의 경우
			// 0~파라미터로 들어간 숫자 -1 까지만
			// 난수로 나온다.
			// 그럼 1~파라미터로 들어간 숫자까지
			// 나오게 할려면
			// 어떻게 해야할까?
			// 메소드 결과갑 + 1을 해주면 된다!
			lottoNumbers[i] = random.nextInt(MAX) + 1;
		}
		// 아직 여기서는 중복이 제거되지 않았기 떄문에
		// 중복 제거부터 해줘야 한다.
		// 하지만 배열은 중복 제거를 할려면?
		// 무식한 방법을 써야한다.
		System.out.println("중복제거전");
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.println(lottoNumbers[i]);
		}
		for (int i = 0; i < lottoNumbers.length; i++) {
			for (int j = 0; j < lottoNumbers.length; j++) {
				if (i != j && lottoNumbers[i] == lottoNumbers[j]) {
					lottoNumbers[i] = random.nextInt(MAX) + 1;
					j = -1;
					// i가 j가 겹치면 안됨
					// i와 j가 다른데 그 인덱스로 들어간 값들이 같으면 중복이란 뜼
					// 그러면 i 번째 랜덤 넥스트인트를 넣어주고 j를 -1로 보내버림
				}
			}
		}
		System.out.println("정렬 후");
		//정렬도 마찬가지
		//중복제거처럼
		//현재위치 다음 위치 비교하고
		//만약 현재위치가 더 크다?
		//그러면 숫서를 바꿔주고 인덱스를 -1로 보내준다.
		for(int i = 0; i < lottoNumbers.length -1;i++) {
			if(lottoNumbers[i] > lottoNumbers[i+1]) {
				int temp = lottoNumbers[i];
				lottoNumbers[i] = lottoNumbers[i+1];
				lottoNumbers[i+1] = temp;
				i = -1;
			}
		}
		
		System.out.println("중복 제거후");
		System.out.println("결과");
		for (int i = 0; i < lottoNumbers.length; i++) {
			System.out.println(lottoNumbers[i]);
		}
	}
}
