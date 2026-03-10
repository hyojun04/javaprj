package class_6;

public class NonGenericExample {

	public static void main(String[] args) {
		/*
		Box1 stringBox = new Box1();
		stringBox.setValue("Hello, Java!");
		
		Box1 intBox = new Box1();
		intBox.setValue(42);
		
		String StringValue = (String)stringBox.getValue();		
		int intValue = (int)intBox.getValue();		
		
		System.out.println(StringValue + " "+intValue);
		*/
		
		Box2<String> stringBox = new Box2<String>();
		stringBox.setValue("Hello, Java!");
		
		Box2<Integer> intBox = new Box2<Integer>();
		intBox.setValue(42);
		
		String StringValue = stringBox.getValue();		
		int intValue = intBox.getValue();		
		
		System.out.println(StringValue + " "+intValue);
		
		
	}

}

class Box1{
	private Object value;
	
	public void setValue(Object value) {
		this.value = value;
	}
	
	public Object getValue() {
		return value;
	}
}

class Box2<T>{
	private T value;
	
	public void setValue(T value) {
		this.value = value;
	}
	
	public T getValue() {
		return value;
	}
}
