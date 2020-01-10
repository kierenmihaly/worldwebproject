package day4;

//배열
//배열이란, 같은 데이터타입이 연결되서 여러개를 한번에 관리하게
//라는 데이터타입니다.
public class ex02 {
	public static void main(String[] args) {
		// 배열 선언하는 방법
		// 데이터타입[] 배열이름 = new 데이터타입[크기];
		// 콘솔프로그래밍을 할일은 없다.
		// 서버에 올려놓는 형식이라 웹페이지에서 결과물이 출력이 되기 때문에
		// 메인 메소드가 없다 그럼 굳이 필요없음
	

		// 프로그램 제작 전에
		// 왜 배열이 나쁜지
		// 알아봅시다.

		// 배열은 크기가 고정되어 있다는 단접이 있다.
		int[] numbers = new int[6];

		// 배열에 각 위치에 접근할 떄에는
		// 배열이름 [위치] 로 접근한다.
		// 위치는 0~크기 -1 까지이다.
		// 값을 넣을때에는
		// 변수이름처럼
		// 배열이름[위치] = 얼마
		numbers[0] = 3;
		numbers[1] = 2;
		numbers[2] = 221;
		numbers[3] = 45;
		numbers[4] = 9;
		numbers[5] = -3;
		// numbers[6] = 92;
		//배열은 크기를 벗어난 위치(index)를 선택하는 순간
		//곧장 오류가 난다!
		
		//즉 정적 사이즈이기 때문에
		//매우 자유롭지 않다. 
		//예를 들어서 우리가 지금 가지고 있는 숫자 배열을
		//크기를 늘려야 하면
		//어떻게 해야할까
		int number1 = 5;
		int number2 = 10;
		//위의 두 변수의 값을 서로 바꾸려면???
		//ab가있으면 c라는 새퀴를 만들어서 바꾸어보장!
		//오피셜하게 다시말하자면
		//프로그래밍 상으로 두 변수의 값을 바꿀 때에는
		//항상 임시저장소를 만들어서
		//한 값을 복사하고
		//복사된 값을 다른 곳에 넣어줘야 한다
		int temp = number1;
		
		number1 = number2;
		number2 = temp;
		
		System.out.println(number1);
		System.out.println(number2);
		//문제는 
		//배열의 크기를 눌려줄려고 하면?
		//기존 배열을 임시 배열에 저장하고
		//기존 배열을 더 큰 크기로 초기화 해주고
		//그 후에 임시 배열의 값을을 복사해줘야 한다

		//그러면 배열을 복사할려면
		//임시 저장용 배열 = 기존 배열
		//요렇게 하면 주소값 복사가 되기 때문에
		//기존 배열을 초기화하는 순간!
		//임시 저장용 배열도 위험하다
		//즉 인덱스의 값을 일일이 다 복사해 줘야 한다.
		int[] tempArray = new int[6];
		for(int i = 0; i < numbers.length; i++) {
			tempArray[i] = numbers[i];
		}
		numbers = new int[10];
		for(int i = 0; i < tempArray.length; i++) {
			numbers[i] = tempArray[i];
		}
		for(int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
	}
}
