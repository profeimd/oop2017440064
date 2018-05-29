
public class Box {
	private Object data; //Object는 모든 클라스들의 Superclass -> JAVA의 모든 클래스를 담을 수 있다. (Primitive type 변수 불가!)
	public void set(Object data) {
		this.data = data;
	}
	public Object get() {
		return data;
	}
	
}
