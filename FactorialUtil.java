import java.util.Scanner;

public class FactorialUtil 
{	


	public static void main(String[] args) 
	{
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("input :    ");

		FactorialUtil util =  new FactorialUtil();
		System.out.println("Result : " + util.fact(keyboard.nextInt()));

	}

	public int fact(int n){
		if(n <= 1){
		
			return n;
		}
		 return fact(n-1)*n;	
	}


}
