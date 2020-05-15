package javaprogramming1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		
		String[] array = new String[list.size()];
		list.toArray(array);
		
		System.out.println(Arrays.toString(array));
		
		
		
	}

}
