
public class Dog extends Animal implements Playable {
	@Override
	void sing () {
		System.out.println("A Dog barks");
	}
	void eat() {
		System.out.println("A Dog eats");
	}
	
	@Override
	public void walk() {
		System.out.println("Walk with a dog");
		
	}
	@Override
	public void fetch() {
		System.out.println("Play fetch with a dog");
		
	}

}
