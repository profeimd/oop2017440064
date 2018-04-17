
public class Cat extends Animal {

	public Cat(String name) {
		super(name);
	}
	@Override //틀린 부분 있으면 알려줌
	public void sing() {
		System.out.println(name + " 야옹");
	}

}
