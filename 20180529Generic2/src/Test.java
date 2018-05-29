
public class Test {

	public static void main(String[] args) {
		//T = String
		Box<String> box = new Box<String>();
		String str = new String("Hello");
		
		box.set(str);
		System.out.println("The Box has " + box.get());
		
		
		//T = Integer
		Box<Integer> ibox = new Box<Integer>();
		Integer i = new Integer(10);
		
		ibox.set(i);
		System.out.println(100 + ibox.get());

	}

}
