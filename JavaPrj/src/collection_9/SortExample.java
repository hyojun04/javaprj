package collection_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortExample {

	public static void main(String[] args) {
		List<Tiger> list = new ArrayList<>();
		list.add(new Tiger("라이거"));
		list.add(new Tiger("백호"));
		list.add(new Tiger("한라산"));
		list.add(new Tiger("백두"));
		
		Collections.sort(list);
		
		for(Tiger t : list) {
			System.out.println(t.name);
		}
		
	}

}
