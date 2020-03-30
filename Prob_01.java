public class Prob_01{
	public static void main(String[] args) {

		System.out.println("주어진 숫자까지의 구구단을 찍습니다");
		System.out.println("-------sample-------");
		printGugudan(4);

		System.out.println("-------sample-------");
		SystemGugudan(9);

		System.out.println("-------sample-------");
		printGugudan(-1);

		System.out.println("-------sample-------");
		printGugudan(10);

		public static void printGugudan(int no){

			if (no>=1 & no <=9){
				for (int i =1;i<=9 ;i++ ){
					for(int j =1; j<=no;j++){
						System.out.print(j+"*"+i+"="+(j*i));
						System.out.print("");
					}
					System.out.println();
				}
			}else{
				System.out.println("1이상 9이하의 값을 입력하셔야 합니다");
			}
		

	}//main
}//class
