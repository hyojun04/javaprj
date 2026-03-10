package advance_10;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MyUtil<T> {
	public List<T> filter(List<T> objects, Predicate<T> pred){
		List<T> output = new ArrayList<>();
		for(T obj : objects) {
			if (pred.test(obj)) {
				output.add(obj);
			}
		}
		return output;
	}
}
