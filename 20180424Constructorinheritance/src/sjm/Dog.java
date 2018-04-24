package sjm;

public class Dog extends Animal {
	public Dog() {// Default Constructor(디폴트 생성자)
//		super(); -> explicit (명시적) / 안 써줘도 알아서 돌아감 = implicit
		System.out.println("Dog 디폴트 생성자");
	}
	public Dog(int a) {
//		super(); -> explicit (명시적) / 안 써줘도 알아서 돌아감 = implicit
		super(a);
		System.out.println("Dog 정수형 생성자");
	}
}
