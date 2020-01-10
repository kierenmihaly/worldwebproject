package day4;

public class ex01 {
	public static void main(String[] args) {
		//객체를 선언할떄에는
		//클래스이름 객체이름 = new 클래스이름();
	
	
	Car myCar = new Car("00가 0000", "페라리", "빨간색", 2019);
	//공간확보를 위해서 생성자를 호출해라! 이런뜻이 된단다;; 
	//setType을 호출한 에는 myCar임 즉 여기서 this는 myCar 
	System.out.println(myCar);
	
	Car yourCar = new Car("00가 0000", "페라리", "빨간색", 2019);

	//여기서 this는 yourCar임 
	System.out.println(yourCar);
	
	
	
	//실질적으로 두개다 주소값을 비교한거다
	//toString처럼 equals도 재 정의 해보자! 
	String mySong = "아이유 노래";
	String yourSong = "trot";
	myCar.playSong(mySong);
	yourCar.playSong(yourSong);
	//데이터타입이 같으면 메소드로 불러올 수 있다.
	//예전에는 메모리 주소가 다르면 다른 객체였다.
	//스프링에서는 클래스와 들어있는 정보가 같으면 같은 객체이다.
	//==>> 데이터를 비교해서 데이터 정보가 같으면 동일한 객체 
	//참조형 데이터타입은 null로 처리 기본형데이터타입은 0으로 처리 됨
	
	//만약 우리가 아무런 지시를 하지 않으면
	//객체가 초기화 될때 필드는 참조형필드는 null로
	//기본형필드는 0으로 초기화된다.
	//이것은 기본 생성자(Constructor)가 해주는 작업인데
	//우리가 생성자를 만들어서
	//기본값들을 셋팅해 줄 수도있따.
	
	//생성자는 기본적으로 리턴타입이 없고
	//클래스 이름과 메소드 이름이 똑같다.
	
	//생성자에는 파라미터가 있는 생성자와
	//파라미터가 없는 생성자 2가지가 있다.
	//한가지 주의해야할 점은
	//파라미터가 있는 생성자를 만들고
	//없는 생성자를 만들어주지 않으면
	//파라미터 없는 생성자를 더이상 호출할 수 없다.
	
	
	}
}
	