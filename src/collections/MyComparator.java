package collections;

import java.util.Comparator;

public class MyComparator implements Comparator<MyClassExample> {


	
	@Override
	public int compare(MyClassExample a1, MyClassExample a2) {
		
		if(a1.getA()<a2.getA()){
		return -1;
		}else if(a1.getA()>a2.getA()){
			return 1;
		}
		
		return 0;
		}	

}
