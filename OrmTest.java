public class OrmTest {
	
    public static void main(String[] args) {
       
        //[1] �Է�
        int[] data = {7, 5, 6, 1, 9};
       

        //Selection Sort
        int temp = 0 ; //������ Swap�� �ӽ� ����
       
        for( int i=0; i < data.length-1; i++){
            for (int j=i+1; j<data.length; j++){               
                if(data[i] > data[j]){ //�������� ; ū���� �ڷ�, data[i] > data[j]
                                       //�������� ; ū���� ������, data[i] < data[j]
                    //������ �� ü����
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
            }
             //���� i��° ������ ���
        }
               
        //[3] ���       
        System.out.println("====== ���� ��� ======");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+"  "); // 1, 5, 6, 7, 9 ��µǵ���
        }
       
    }
}