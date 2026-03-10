package defaultAPIclass_12;

import java.util.Objects;

public class Pen {
	String id;
	String color;
	
	public Pen(String id, String color) {
		this.id = id;
		this.color = color;
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pen other = (Pen) obj;
		return Objects.equals(color, other.color) && Objects.equals(id, other.id);
	}
}
