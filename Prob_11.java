public class Prob_11
{
	///main method
	public static void main(String[] args)
	{
		int month = Integer.parseInt(args[0]);
		new Prob().printSeason(month);

	}//class

	public void printSeason(int month);
			if(month > 12 || month < 1) {
				System.out.println("1~12 사이의 숫자만 입력하셔야 합니다");
				return;

		switch(month){
		
			case 3:
			case 4:
			case 5:
				System.out.println("봄에 태어나셨네요");
				break;


			case 6:
			case 7:
			case 8:
				System.out.println("여름에 태어나셨네요");
				break;

			case 9:
			case10:
			case11:
				System.out.println("가을에 태어나셨네요.");
				break;
			
			case12:
			case1:
			case2:
				System.out.println("겨울에 태어나셨네요.");
				break;




			}//end of switch

		}//end of main

	}//end of class 

/*
	case 1:의 break 를 주석처리하고 실행해 보면...
	어떤 결과가 나오는지 확인하자. ==> break 의 역활확인
*/