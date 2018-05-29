
public class Box <T> { //T라는 타입의 변수가 입력으로 들어오는 함수라고 생각하면 된다.
	private T data; // 필드의 타입이 받아들인 변수의 타입이 될 것이다.
	public void set(T data) {
		this.data = data;
	}
	public T get() {
		return data;
	}
	

}
