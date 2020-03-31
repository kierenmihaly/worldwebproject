import java.util.Vector;

public class ArrayCopy{

	public Vector<String>moveToVector(String[] datas){

		list<String> v=new Vector<String>();

		for(int loop=data.length-1;loop>=0;loop--){
			v.add(datas[loop]);
		}
		return v;
}

public static void main(String args[]){
	ArrayCopy ac = new ArrayCopy();
	String dates[]={"1","2","3","4","5"};
	System.out.println(ac.moveToVector(datas));

	}//main
}//class