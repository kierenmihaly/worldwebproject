• 중첩 for 문

For문 내에 또 다른 for문을 포함시킬 수 있다

이중포문 trainning -- 별찍기

For(int i=1;i<=5;i++) {
//System.out.println("**********");
For(int j=1;j<=10;j++) {
  System.out.print("*");
}
System.out.println();
}
//처음에 for 문은 별 다섯개 찍는거

*2차원 배열

Int[][] score = new int[4][3];





Score[0][0] = 100; //배열 score의 1행 1열에 100을 저장
System.out.println(score[0][0]);

Int [][] arr = {
    {1, 2, 3},
    {4, 5, 6}
  };
  이런식으로 작성





오버라이딩
- 상속받은 조상의 메서드를 자신에 맞게 변경하는것




Ch-23 다형성 polymorphism

-조상 타입 참조 변수로 자손 타입 객체를 다루는것

Tv t = new SmartTv(); // 타입 불일치 ok

일치하지 않아도 되는 !
보통은
Tv t = new Tv(); 이런식 인데 이제는 불일치 해도된다
여기서 Tv t는 참조변수 , SmartTv 는 인스턴스

조상 자손인 관계면 된다

반대로

자손타입의 참조변수로 조상 타입의 객체는 안된다

Tv t = new SmartTv(); //ok
SmartTv s = new Tv();









추상클래스 !!=abstract class ==미완성클래스

미완성메서드=추상메서드 (몸통이없는 미완성 메서드)

미완성 설계도, 미완성 메서드를 갖고 있는 클래스

Abstract class Player { //추상클래스(미완성 클래스)
Abstract void play …


다른 클래스 작성에 도움을 주기 위한 것. 인스턴스 생성 불가
Player p = new Player(); //에러 추상클래스의 인스턴스 생성 불가
Ex)미완성설계도>>제품생산불가


-상속을 통해 추상 메서드를 완성해야 인스턴스 생성가능

Class AudioPlayer extends Player
Void play(int pod) {}
Void stop() {}
}

추상메서드에 몸통을 만들어주는것 = 구현
더이상 abstract라고 붙일필요없음
여기서 오디오 플레이어는 완성된 설계도

AudioPlayer ap = new audioPlayer(); // ok; 인스턴스생성 ok

audioPlayer 대신에 Player도



*추상메서드 =abstract method
미완성메서드. 구현부 (선언부만 있고 몸통이없는메서드)
Abstract 리턴타입 메서드이름);
꼭 필요하지만 자손마다 다르게 구현될것으로 예상되는 경우

Abstract class Player { //추상클래스
Abstract void play(int pos);   //추상메서드
Abstrac void stop();   //추상메서드
}

Class AudioPlayer extends Player {
Void play(int pos) { } //추상메서드 구현
Void stop() {} //추상메서드 구현

Class AbstractPlayer extends Player {
  Void play(int pos) { } //추상메서드 구현
