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
				System.out.println("1~12 ������ ���ڸ� �Է��ϼž� �մϴ�");
				return;

		switch(month){
		
			case 3:
			case 4:
			case 5:
				System.out.println("���� �¾�̳׿�");
				break;


			case 6:
			case 7:
			case 8:
				System.out.println("������ �¾�̳׿�");
				break;

			case 9:
			case10:
			case11:
				System.out.println("������ �¾�̳׿�.");
				break;
			
			case12:
			case1:
			case2:
				System.out.println("�ܿ￡ �¾�̳׿�.");
				break;




			}//end of switch

		}//end of main

	}//end of class 

/*
	case 1:�� break �� �ּ�ó���ϰ� ������ ����...
	� ����� �������� Ȯ������. ==> break �� ��ȰȮ��
*/