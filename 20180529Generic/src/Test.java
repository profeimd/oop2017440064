
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str); //String 넣어주면 upcasting해서 Object로 들어갈 거임(상속 관계이기 때문!)
		String str1 = "Mr." + box.get();
		
		//int: primitive type / Integer: reference type (Class임!)
		Integer i;
		i = new Integer(3); //i = 3; 으로 코딩해도 되지만 지금한 게 더 우아한 방법
		System.out.println(i);
//		i = 1 + box.get();
		System.out.println("the box contain " + box.get());
		System.out.println("the box contain " + str1);
		
		int a = 10;
		box.set(a); //Autoboxing
		System.out.println(box.get());
//		System.out.println(10 + box.get()); //int + Object 는 정의되지 않음
		System.out.println(10 + (Integer) box.get()); //이렇게 box 안에 있는 데이터의 자료형을 알고 있어야 됨
		
	}

}
