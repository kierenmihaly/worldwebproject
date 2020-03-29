Return

실행 중인 메서드를 종료하고 호출한 곳으로 되돌아간다

Void printGugudan(int dan) {
	If(! < 2<= dan %% dan <= 9))
		Return; //dan의 값이 2~9가 아닌경우,
		//호출한 곳으로 그냥 되돌아간다


	For(int I = 1; I < = 9; i++) {
		System.out.printf("%d * %d = %d$n", dan, I, dan*i);
		}
	//return; //반환 타입이 void이므로 생략가능.컴파일러가 자동추가
	}
	//메서드가 작업을 마쳤을때 원래 호출한곳으로 돌아가야하는데
	매번쓰기 귀찮으니까 생략함 .


*반환타입이 void가 아닌 경우, 반드시 return문 필요

Int multiply(int x, int y) {
	Int result = x * y;

	Return result; //반환타입이 void가 아니므로 생략불가
	}

	Int mac(int a, int b) {
		If(a > b)
			Return a;//조건식이 참일 때만 실행됨
	}

	//에러 ; 리턴문이 없음 이라고 나옴
	//조건식이 참일때 리턴문 있는데 거짓일때는 없다.
	// 참일때 거짓일때 모두 리턴문이 있도록 작성해야한다
	//ex) int mac(int a, int b) {
		If(a > b)
			Return a;
		Else
			Return b;
		}




*switch

처리해야 하는 경우의 수가 많을 때 유용한 조건문
Switch는 조건식을 한번만 계산하면됨 / 제약조건; 쓰고싶어도 쓸 수 없는 경우가 있음 - 경우의 수가 많을때는 switch가 쓰는게 좋음 /
항상 if문으로 바꿀 수 있음 .
If elseif는 treu,false 두가지만 있음 / 대신조건식이 여러개 나옴 , 코드블락이 많이 나옴 /경우의수가 너무 많아서 복잡함

Switch (조건식) - 정수, 문자열
	Case 값1:
		Break;
	Case 값2 :
		Break;


switch문의 제약 조건 ; 조건식 결과는 정수 또는 문자열이어야한다
Case문의 값은 정수, 상수(문자 포함) , 문자열만 가능 / 중복되지 않아야 한다. 변수, 실수는 쓸수없고 정수만 가능 !


	• 조건문과 반복문
	• 반복문
	For, while

For(int i=1; i<=5;i++) {
	System.out.println("I can do it");
	}
		  1       2        4
	For(초기화;조건식;증감식) {
			3 수행될 문장
	}



	참이면 2,3,4 계속 반복 처음에 초기화 한 번하고
	234 계속 반복

	Public static void main(String args[]) {
		For(int i=1;i<=5;i++) {
			System.out.println("hello");
			}
		}//main
	}//class
