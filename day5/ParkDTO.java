package day5;
//객체 지향 프로그래밍 5원칙

//SOLID
//S : Single responsibility -단일책임원칙 이라는 법이있다.
//클래스는 하나의 통일된것만 담당을 해야한다
//예를들어서 계산기 프로그램을 만든다 가정했을 떄
//계산을 하는 부분과 ui를 담당하는 부분이있는데
//계산부분은 계산하는 부분만 들어있어야 하고 ui는 ui담당하는 코드만 있어야한다.
//즉 하나의 클래스는 하나의 기능만 담당 해야한다 
//지금은 int로 시간을 받았는데 나중에 다른걸로 시간을 받게된다면 
//이런건 컨트롤러쪽에서 담당을 해야한다 
//
//O : Open-Closed
//L; Liskov
//I; Interface
//D;Dependency Injection

//여기서 여러분들이 명심해야 할것은
//S이다. 
public class ParkDTO {

	// 여기서 명심해야할것은
	// S이다.
	// DTO란 Data Transfer Object의 줄임말로써
	// 필드와 겟터/셋터, equals, toString정도만 들어가게 된다.

	private String plateNumber;
	// 자동차 번호
	private int inTime;

	public String getPlateNumber() {
		return plateNumber;
	}

	public void setPlateNumber(String plateNumber) {
		this.plateNumber = plateNumber;
	}

	public int getInTime() {
		return inTime;
	}

	public void setInTime(int inTime) {
		this.inTime = inTime;
	}

	public boolean equals(Object o) {
		if (o instanceof ParkDTO) {
			ParkDTO p = (ParkDTO) o;
			if (plateNumber.equals(p.plateNumber))
				// 자동차 번호가 같을때 !
				return true;
		}
		return false;
	}

}
