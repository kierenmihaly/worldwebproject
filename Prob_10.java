public class Prob_10
{
	public static void main(String[] args) {
		int num1 = 6;
		int num2 = 15;

		Prob_10 prob = new Prob_10();
		System.out.println("두수의차는 :"+prob.abs(num1,num2));
	}
		
		public int abs(int num1, int num2){

		int temp = 0;

		if(num1 > num2){
			temp = num1-num2;
		}else{
			temp = num2-num1;
		}
		return temp;

	}//main
}//class
