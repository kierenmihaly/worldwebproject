package day4;

import java.util.ArrayList;

//ArrayList
//어레이리스트란 배열을 클래스처럼 만들고
//대신 가변적 길이를 적용시킨 방법이다.
public class ex04 {
	public static void main(String[] args) {
		//어레이리스튼 주소값을 연결시키는 방법을 써서 
		//가변적 길이를 구현해 놓았다!
		
		//
		// 어레이 리스트는 ㅁ-ㅁ-ㅁ-ㅁ 
		//-선은 주소값을 말한다.
		//예를들어 우리가 맨 뒤에 추가해주려한다
		//근데 이친구는 맨마지막에 다음주소값이 없는데 그럼 
		//주소값을 만들어주면 된다 그래서 아래처럼 만들 수 있따
		//ㅁ-ㅁ-ㅁ-ㅁ-ㅁ 
		//중간에 ㅁ을 넣어 만들 수도있다. 
		//object는 객체 , 객체는 무엇인가? 클래스 변수다
		//참조형 변수들은 주소값을 가지고 있다
		//주소값이 없는 친구들은 기본형데이터타입 8개이다
		//그럼 기본형데이터타입은 어레이를 만들 수 없나?
		//자바는 기본형데이터타입8개를 클래스처럼 만들어 놓은게 있다
		//클래스 배열은 주소값을 가지고 있다. 근데 많은 단점을 가지고있따.
		//연결된애들도 클래스 생성자를 호출해줘야한다. 만약 클래스 생성자를 
		//호출하지 않으면 아파트 단지 농장에 소를 볼 수 있을것이다.
		
		//오피셜하게 다시말하면
		//어레이리스트는 주소값을 쓰기 떄문에
		//객체만 받아들일 수 있다.
		//하지만 기본형 데이터타입들은 주소값이 없기 때문에
		//기본형 데이터타입이 아닌 포장 클래스(wrapper class)
		//를 사용해서 컨트롤 해야한다. 
		Student[] students = new Student[15];
		//이5는 배열을 위한 생성자가 되버린다. 
		for(int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}
		//students[0].setName("조재영");
		//배열 그자체의 생성자가 된당!
		
		
		//ArrayList<모아놓을 클래스> 변수명 = new ArrayList<>
		//참고로 int의 wrapper 클래스는?
		//Integer다
		Integer number = new Integer(5);
		Integer number2 = 6;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		//리스트에 추가 될 수 있는 객체의 종류는
		//< >에 들어가 있는 클래스 객체만 들어갈 수 있다!		
		
		//리스트에 객체를 추가할 떄에는 add(객체) 메소드를 실행해서
		//추가한다.
		list.add(number);
		list.add(number2);
		list.add(5);
		//클래스 객체만 들어갈 수 있다. 
		//list.add("132");
		//위 132는 integer가 아닌 string이니까 들어갈 수 없다
		
		//리스트에서 값을 출력하거나 빼올 때에는
		//get(인덱스) 메소드를 실행한다.
		System.out.println(list.get(1));
		
		//리스트에서 값을 삭제할 때에는
		//remove(인덱스) 혹은 remove(객체) 메소드를 실행한다
		
		//리스트 안에 몇개의 요소가 존재하는지
		//알고 싶을 때에는 size() 메소드를 실행한다.
		System.out.println(list.size());
		list.remove(1);
		System.out.println(list.get(1));
		System.out.println(list.size());
		//배열을 처음에 설정할때 length가 나온다 
		
		//remove(객페) 의 경우에는 
		//list가 자체적으로 모든 요소에 대해서
		//equals() 메소드를 실행해서
		//true 가 나오는 첫번째를 삭제한다
		Integer number3 = new Integer(5);
		list.remove(number3);
		System.out.println(list.size());
		
		//만약 특정 객체의 리스트안의 위치를 알고 싶으면
		//indexOf(객체)를 실행하면 된다.
		list.add(23);
		list.add(31);
		list.add(22);
		System.out.println(list.indexOf(23));
		//만약 indexOf(객체)가 해당하는 객체를 못찾으면?
		//-1이 리턴된다.
		System.out.println(list.indexOf(18721));
		
		//주의할 점:
		//indexOf(객체), remove(객체)
		//의 경우에는
		//객체에 정의되어있는 equals()메소드를 실행해야 하기 때문에
		//여러분들이 만드는 클래스에
		//equals()를 만들어 줘야 
		//정상적으로
		//사용 가능하다. 
	}
}
