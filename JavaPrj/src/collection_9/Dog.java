package collection_9;

import java.util.Objects;

public class Dog extends Object{
	String dogId;
	String dogName;
	
	public Dog(String dogId, String dogName) {
		super();
		this.dogId=dogId;
		this.dogName = dogName;
	}
	
	public String toString() {
		return dogId + " : " + dogName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(dogId, dogName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return Objects.equals(dogId, other.dogId) && Objects.equals(dogName, other.dogName);
	}
	
	

}
