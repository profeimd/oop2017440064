
public class Test {

	public static void main(String[] args) {
		Box box = new Box();
		String str = new String("Hello");
		
		box.set(str); //String �־��ָ� upcasting�ؼ� Object�� �� ����(��� �����̱� ����!)
		String str1 = "Mr." + box.get();
		
		//int: primitive type / Integer: reference type (Class��!)
		Integer i;
		i = new Integer(3); //i = 3; ���� �ڵ��ص� ������ ������ �� �� ����� ���
		System.out.println(i);
//		i = 1 + box.get();
		System.out.println("the box contain " + box.get());
		System.out.println("the box contain " + str1);
		
		int a = 10;
		box.set(a); //Autoboxing
		System.out.println(box.get());
//		System.out.println(10 + box.get()); //int + Object �� ���ǵ��� ����
		System.out.println(10 + (Integer) box.get()); //�̷��� box �ȿ� �ִ� �������� �ڷ����� �˰� �־�� ��
		
	}

}
