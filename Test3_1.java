public class  Test3_1
{
	public static void main(String[] args) 
	{
		int i = Integer.parseInt(args[0]);	
		int j = Integer.parseInt(args[1]);

if(i%2==0 && i%3==0) {
	System.out.println("입력하신 1번째 인자값 "+i+" 는 짝수이며 3의 배수입니다.");
}if(i%2==0 && i%3!=0) {
	System.out.println("입력하신 1번째 인자값 "+i+" 은 짝수이며 3의 배수가 아닙니다.");
}if(i%2!=0 && i%3==0) {
	System.out.println("입력하신 1번째 인자값 "+i+" 은 홀수이며 3의 배수입니다. ");
}if(i%2!=0 && i%3!=0) {
	System.out.println("입력하신 1번째 인자값 "+i+" 은 홀수이며 3의 배수가 아닙니다.");
}
else {
	if(j%2==0 && j%3==0) {
		System.out.println("입력하신 1번째 인자값 "+j+" 는 짝수이며 3의 배수입니다.");
	}if(j%2==0 && j%3!=0) {
		System.out.println("입력하신 1번째 인자값 "+j+" 은 짝수이며 3의 배수가 아닙니다.");
	}if(j%2!=0 && j%3==0) {
		System.out.println("입력하신 1번째 인자값 "+j+" 은 홀수이며 3의 배수입니다. ");
	}if(j%2!=0 && j%3!=0) {
		System.out.println("입력하신 1번째 인자값 "+j+" 은 홀수이며 3의 배수가 아닙니다.");

	}
}



	}//end of main
}// end of class
