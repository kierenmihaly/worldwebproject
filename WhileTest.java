//package jb02.part02;

/*
	FileName : WhileTest.java
	1.while(조건)
	2.do..while(조건)
	활용 및 차이점을 확인
/*
public class WhileTest{

	///main method
	public static void main(String args[]){
	
	//while문
	int i = 0;		//#1.순환문의 조건을 주기위한 int i 초기화 
	while(i<10){ 	//#2.조건(boolean data type)
	//while( 0 ) {	//==>compile error (error 를 확인하면....)
		System.out.println("여기는 while 문내부안임 i = "+i);
		i++; //#3. 증감식
}

	//do-while 문
	int j = 0;		//#1.순환문의 조건을 주기위한 int j 초기화
	do{
		System.out.println("\n\t여기는 do문 내부임 j = "+j);
		j++;	//#2.증감식
	}while(j<1); // #3. 조건(boolean data type)