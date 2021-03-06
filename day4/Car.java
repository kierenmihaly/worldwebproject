package day4;

//클래스 예제 01
//자동차 클래스를 만들어보자
//자동차의 정보는 뭐가 있을까요?
//모델(type), 연식(age), 색상(color), 등록번호(plateNumber),
//자동차의 기능은 뭐가 있을까요?
//액셀, 정지, 주차, 노래틀기
public class Car {
	// 먼저 필드부터
	// 필드는 데이터타입 필드명으로 적어준다

//		접근제한자(Access Modifier)
//		접근제한자란, 해당 필드나 메소드가 어디서 접근이 
//		가능한지 설정해주는 예약어

	// 접근제한자는
	// public - default(protected) - package - private
	// 단계가 있다.
	// public : 어디서든지 접근 가능(외부 패키지도 가능)
	// protected: 같은패키지 혹은 상속받는 클래스들이면 접근 가능
	// 아무것도 안 적어주면 자동으로 해당 접근제한자가 걸림
	// package: 같은 패키지 내부에서만 접근 가능
	// private: 자기 자신외에는 접근 불가

	// 예전에는 필드를 퍼블릭이나 디폴트로 아무런 변경 안해주던게
	// 표준이었다.

	// 하지만 데이터의 무결성 그리고 캡슐화 라는 개념이 나옴으로써
	// 모든 필드를 프라이빗으로 설정해주는게 표준이 되었다.

	private String type;
	private int age;
	private String color;
	private String plateNumber;

	// 근데 필드를 프라이빗 하면?
	// 외부 클래스에서 객체를 만들고 그 객체에 값을
	// 직접 넣어줄 수 없게 된다!
	// 그러면 어떻게 값을 넣어줘야 될까?
	// 이제는 메소드를 통해서 값을 저장하거나 불러오게 하는거다.
	// 요러한 값을 주고 받는 메소드를 겟터/셋터 라고 부르고
	// 이러한 겟터/셋터를 만드는 것을 캡슐화라고 한다.

	// 겟터는 객체에 저장되어 있는 값을
	// 호출된 곳으로 보내주는 메소드이다.
	// 겟터는
	// public 필드데이터타입 get필드명() {
	// return 필드명;
	// }
	// 으로 만들어준다.
	public String getType() {
		return type;
	}

	// Setter는 외부에서 값을
	// 객체 내부에 저장을 할때 호출된다.
	// 셋터는
	// public void set필드이름(필드데이터타입 필드명) {
	// this.필드명 = 필드명;
	// }

	public void setType(String type) {
		this.type = type;
	}

	// 파라미터를 그냥 써주면은 파라미터가 좀더 우선순위가 높다 여기서
	// 파라미터는 코발트파란색 type을 말한다. (하늘색 말고)
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}
	// 메소드를 만들어보자
	// 메소드는 리턴타입 메소드이름(파라미터)
	// 파라미터란? 외부에서 해당 메소드를 호출할때
	// 이 메소드가 필요로 하는 데이터를 넘겨주기 위해 사용된다.
	// 파라미터는 파라미터의 데이터타입 파라미터의 이름 으로 쓰게 되는데
	// 파라미터란? 외부에서 해당 메소드를 호출할때 이 메소드가 필요로
	// 하는 데이터를 넘겨주기 위해 사용된다.
	// 이 파라미터의 이름은 외부에서 넘겨주는 데이터의 이름과 일치될 필요가 없다.

	void playSong(String title) {
		System.out.println(title + "곡을 재생합니다.!");
	}
	// void는 이 메소드가 종료되고 아무런 값을 넘겨주지 않을 떄, void라고 적어준다.

	// 모든 클래스(자바가 기본 제공하건 우리가 만들던)는
	// java.lang.Object 클래스를 상속받는다.
	// 이 java.lang.Object는 클래스는 몇몇 기본 메소드들을 제공해준다.
	// 대표적으로 toString(), equals(Object o) 메소드가 있다.
	// toString()의 경우 클래스 객체의 정보를 보여주는 메소드이지만,
	// 우리가 override(재정의)를 해주지 않으면
	// java.lang.Object에서 제공해주는
	// 클래스 정보@객체의 메모리주소값
	// 만 출력한다.
	// 그러면 우리가 재정의를 해서
	// 우리가 원하는 정보를 출력하게 만들자

	public String toString() {
		// System.out.println()의 경우
		// 파라미터로 객체가 넘어오면
		// 해당 객체의 toString() 메소드를 실행시켜서
		// return된 String 값을 출력해준다
		return "차량 번호: " + plateNumber + ", " + "차량 종류: " + type + ", 차량 색상: " + color + ", 차량 연식: " + age;
	}

//	equals() 메소드는
	// 호출하는 객체와 파라미터로 넘어온 모든 클래스 객체를 비교해서
	// 먼저 그 두 객체가 같은 클래스의 객체인지 확인하고
	// 만약 같은 클래스 객체라면
	// 칠드의 특정값들(ex: 관리번호, id 등 unique한 값) 을
	// 비교해서
	// 일치하면 true 틀리면 false가 나오게 만들어 준다.
	public boolean equals(Object o) {
		// 제일 먼저 파라미터로 넘어온
		// o가 우리 클래스의 객체인지 확인한다
		// 우리 클래스 객체인지 확인할 때에는
		// instanceOF 라는 예약어를 통해서 확인한다.

		if (o instanceof Car) {
			// 만약 이 if 블락안에 들어왔다
			// 즉 o가 Car의 객체라는 의미이므로
			// Typecasting을 통해서
			// o를 Car의 객체로 만들어준다.
			Car c = (Car) o;

			// 카클래스 객체 필드에 타입이 있어야하는데 없으면 오류가 남
			// 너가 카의 객체니? 틀을 씌워서 카의 객체로 만들어준다
			// 그다음에
			// typecasting된 car의 필드값과
			// 이 메소드를 호출하는 필드값
			// 특정 필드값을 비교해서
			// 같으면 return true 해준다
			if (plateNumber.contentEquals(c.plateNumber)) {
				return true;
			}
		}
		return false;
	}

	public Car(String plateNumber, String type, String color, int age) {
		// 여기서 이제
		// 필드 초기화나 혹은
		// 다른 시작하자마자 할 작업이 있으면
		// 적어준다.
		this.plateNumber = plateNumber;
		this.type = type;
		this.color = color;
		this.age = age;

	}
	// null이란 무엇인가
	// 메모리주소가 배정은 됐는데 초기화가 안되어있는상태
	// 아파트 주소가 나와있긴한데 아직 건물이 나와있지 않은상태
	// 만약 안알아보고 계약하고 냉장고랑 티비를 배달시켰다, 어떻게 될까?
	// 마찬가지로 널은 메소드나 필드에 접근할 수 없다.
	// 다시 오피셜하게 말하자면
	// 주소값은 할당이 되어있지만
	// 해당 주소가 클래스 객체로 초기화 되지 않은 상태를 뜻한다.
	// 따라서 클래스에 정의되어있는 필드나 메소드를
	// 접근 할 수 없고
	// 접근하려고 하면 java.lang.NullPointerException이
	// 발생하게 된다.

}
