package day5;
//컨트롤러 클래스는 

//DB와의 통신을 통해서 
//데이터의 CRUD를 실질적으로 담당
//crud 이건 흔하게 나오는거당 
//Create(생성)
//Retrieve(불러오기)
//Update(수정)
//Delete(삭제)
//하지만 우리는 DB가 없으므로
//여기서 애햐하는 역할은
//입차와 출차에 관련된 기능만 넣자!

import java.util.List;

public class ParkController {
	
	private final int UNIT_PRICE = 1000;
	private final int UNIT_MINUTE = 10;
	// 주차장의 크기를 뜻하는 상수
	
	// 주차장개수가 5개가, 나중에 바뀔수도있으니 이렇게 해둔다.

	// 입차 기능 구현
	// 입차할때 순서도
	// 1. 빈 공간이 있는지 체크
	// 2. 입력된 번호가 중복인지 체크
	// 3. 입력된 시간이 유효한지 체크
	// 4. 입력!
	// 데이터컨트롤 할떄 어레이 리스트로 컨트롤 하기로 했다

	// 의존성 주입
	// Dependency Injection
	// 이개념은 이해하기가 어렵다
	// 이거 이해하면 둘중하나다.
	// DI라는 개념은 !! 사실
	// spring으로 가면 자동으로 알아서 해준다
	// DI는 스스로 할 수 없고 , 얘가 없으면 안되나는 뜻이다
	// 특정라이브러리를 꼭 써야하는게 단단한 형태이고
	// 느슨하게 만드는게 있고 이럴 때 DI를 쓰게 된다
	// 우리가 어레이 리스트를 꼭 써야하는 상황인데
	// 근데 여기서 초기화 하지 않고 외부에서 받아온
	// 리스트를 가지고있을것이다.
	// 필드를 하나가지고 있을 건데...

	List<ParkDTO> list;

	// 의존성 주입에는 메소드를 통한 주입과
	// 생성자를 통한 주입니 있다.
	// 우리는 생성자를 통한 주입을 이용할 것이다.

	public ParkController(List<ParkDTO> list) {
		// 이제 외부에서
		// Controller를 생성해주면
		// 이 리스트를 받아와서 생성하기 때문에
		// 한번 만들어진 리스트가
		// 계속 유지된다. -->즉 유사 DB가 되었다!
		this.list = list;

	}

	// 제일 먼저 주차장 비어있는 공간을 확인해서
	// 여유 공간이 있으면 true
	// 없으면 false를 리턴해주는 메소드를 만들어보자
	
	//주차장에 차가 몇대가 있는지
	//숫자를 리턴해준다. 
	public int size() {
		return list.size();
	}

	// 입력된 번호가 중복인지 체크해서
	// 중복이면 현재위티 아니면 -1을 리턴해주는 메소드를 만들어보자
	public int indexOf(ParkDTO p) {
		return list.indexOf(p);
		// p는 파라미터로 넘겨주면 쓰는거
		// 기준은 플레이트 넘버가된다.
	}

	// 시간이 유효한 형태인지 체크해서
	// 유효하지 않으면 false 유효하면 true를 리턴하는
	// 메소드를 만들어보자
	public boolean validateTime(int time) {
		//시간이 4자리 숫자의 int로 넘어올텐데
		//어떻게 해야
		//앞의 두자리 뒤의 두자리를 분리시킬 수 있을까?
		//1234 나머지 100 하면 된다 예를들어 
		int hour = time / 100;
		int minute = time % 100; 
		if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60) {
			return true; 
		}
		return false;
	}
	
	//입력받은 정보로 만들어진 ParkDTO 객체를 
	//우리의 list에 추가해주자
	public void add(ParkDTO p) {
		list.add(p);
	}
	
	//출차시 순서도
	//1.한대라도 들어와있는지 체크
	//2. 입력받은 번호가 존재하는지 체크 
	//3. 입력받은 시간이 유효한지 체크 
	//		이때는 시간의 유형뿐만이 아니라 입차 시간보다
	//		출차시간이 늦어야 한다.
	//4. 요금 계산하기 
	//5. 해당차량 리스트에서 삭제
	
	//3번을 위해서
	//index번호를 주면
	//list에서 해당번호(index) 에있는
	//parkDTO 객체를 리턴하는 메소드를 만든다.
	public ParkDTO selectOne(int index) {
		//전통적으로
		//객체 하나만 넘겨주는 메소드의 이름은
		//selectOne
		//리스트 전체를 보내주면
		//selectAll 혹은 select 라고 부른다 
		return list.get(index);
	}
	
	//요금을 게산할 때 필요로 하는
	//메시지는
	//뷰어에서 출력하기 때문에
	//여기서는
	//금액만 계산해서 
	//뷰어로 보내주는 메소드를 만들어주자
	public int calculateRate(int inTime, int outTime) {
	//calaualteRate메소드를 호출할때 int를 2개 넘겨주기만 하면 된다
		//시간의 차이를 계산
		int hourDifference = 
				outTime / 100 - inTime / 100;
		int minuteDifference =
				outTime % 100 - inTime % 100; 
		int totalDifference = 
				hourDifference * 60 + minuteDifference;
		//요금 계산은 
		//10분당 1000원 
		int rate = totalDifference / UNIT_MINUTE * UNIT_PRICE;
		return rate;
		
	}
	public void remove(ParkDTO p) {
		list.remove(p);
	}
}