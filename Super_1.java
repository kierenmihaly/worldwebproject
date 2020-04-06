class Super_1
{

	public int I = 0;
	public Super_1(int i){
		O = 1;
	}

}//class

public class Sub extends Super_1{
	public Sub(String text){
		I =2;

}

	public static void main(String args[]){
		Sub sub = new Sub("Hello");
		System.out.println(sub.i);
	}
}//class