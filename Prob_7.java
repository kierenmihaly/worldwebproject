public class Prob_7{

	public static void main(String[] args){

		int year = 2010;
		int month = 2;
		int maxDay = 0;

	if((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0) {

			maxDay = 29;

		System.out.println("�����Դϴ�.");

	}else{
		maxDay = 28;
	}


		System.out.println(year+"��"+month+"���� ������"+maxDay+"�� �Դϴ�");
	}//main

} //class