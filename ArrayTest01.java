public class ArrayTest01{

		public static void main(String args[]) {

	int[] intArray = new int[9];

	/*
	intArray[0]=1;
	intArray[1]=2;
	intArray[2]=3;
	intArray[3]=4;
	intArray[4]=5;
	intArray[5]=6;
	intArray[6]=7;
	intArray[7]=8;
	intArray[8]=9;
	*/


	//�迭�� index�� �̿� ������ value�� ���� 
	for( int j = 0; j < 9; j++){
		System.out.println("intArray["+j+"] ���� : "+intArray[j]);
	}

	//������ ���� �̿��Ͽ� 5���� ��� intArray.length
	//Operator �� length keyword ��� 
	System.out.println("==================");
	for( int k = 0; k<intArray.length; k++) {
		System.out.println(" 5 X " +intArray[k]+"="+5*intArray[k]);
	}

	//�Ʒ��� ��� ������ �������� (primitive int i =0;�� �� �����ϸ��)
	int [] j = intArray;
	System.out.println("==================");
	System.out.println("j[0]�� ���� :" +j[0]);
	System.out.println("j[5]�� ���� :" +j[5]);

	j[5]=1234;
	System.out.println("j[5]==>"+j[5]);


		}//main
}//class