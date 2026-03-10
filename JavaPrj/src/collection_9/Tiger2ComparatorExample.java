package collection_9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tiger2ComparatorExample {
	public static void main(String[] args) {
		List<Tiger2> list = new ArrayList<>();
		list.add(new Tiger2("라이거"));
		list.add(new Tiger2("백호"));
		list.add(new Tiger2("한라산"));
		list.add(new Tiger2("백두"));
		
		Collections.sort(list, new Tiger2Comparator());
		
		for(Tiger2 t : list) {
			System.out.println(t.name);
		}
	}

}
