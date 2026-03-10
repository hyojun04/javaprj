package collection_9;

public class Tiger implements Comparable<Tiger>{
	String name;
	
	Tiger(String name){
		this.name = name;
	}
	
	public int compareTo(Tiger obj) {
		return this.name.compareTo(obj.name);
	}
}
