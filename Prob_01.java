public class Prob_01{
	public static void main(String[] args) {

		System.out.println("�־��� ���ڱ����� �������� ����ϴ�");
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
				System.out.println("1�̻� 9������ ���� �Է��ϼž� �մϴ�");
			}
		

	}//main
}//class
