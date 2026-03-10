package collection_9;

import java.util.Comparator;

public class Tiger2Comparator implements Comparator<Tiger2>{
	@Override
	public int compare(Tiger2 o1, Tiger2 o2) {
		return o1.name.compareTo(o2.name);
	}
}
