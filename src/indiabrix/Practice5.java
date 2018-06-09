package indiabrix;

import java.util.ArrayList;

public class Practice5 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> arr = new ArrayList<>();
		
		arr.add(5);
		arr.add(6);
		arr.add(7);
		arr.add(8);
		
		arr.remove(arr.size()-1);
		
		System.out.println(arr);
	}

}
