import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		Animal aaa = new Animal(); //����1. �� ���� ���� �� ���µ��� �׸��ÿ�.
//		aaa.sing(); //����2. �� ���� ���� �� ȭ�� ����� ���ÿ�. 
//		Dog tina = new Dog(); //����3. �� ���� ���� �� ���µ��� �׸��ÿ�.
//		tina.sing(); //����4. �� ���� ���� �� ȭ�� ����� ���ÿ�.
//		tina = new Dog(); //����5. �� ���� ���� �� ���µ��� �׸��ÿ�. ('����3'�� �̾!)
//		tina.eat();
//		//error aaa.eat();
		//�캯 Ŭ�󽺰� �º� Ŭ���� subclass�̸� ���� ���� ����. �º� <-- �캯 (Inheritance ǥ��)
		//Upcasting(����� ĳ����)
		//Animal aaa = new Dog(); //#15�� ���� ǥ��
		Animal aaa = (Animal) new Dog(); //subclass�� superclass�� casting
		// overriding�� �޼ҵ带 ȣ���ϸ� subclass�� �޼ҵ带 �����Ѵ�.
		aaa.sing();
		aaa = new Cat();
		aaa.sing();
		//������(polymorphism)
		//1. �ϳ��� Ŭ�󽺷κ��� ���� ����Ŭ�󽺸� ���� ���
		//2. ��� ����Ŭ�󽺴� ����Ŭ���� �޼ҵ带 override�Ѵ�.
		//3. SuperClass SuperReferenceVariable = new SubClass();
		//4. superRefVar.overfidedMethod() -> ��ü�� Ŭ�󽺰� ������ �޼ֵ带 �����Ѵ�.
		
		Scanner ss = new Scanner(System.in);
		String str = ss.next();
		if(str.equals("dog")) aaa = new Dog();
		else aaa = new Cat();
		aaa.sing(); // ���� ���ε�(Dynamic Binding): ���α׷� ����� ȣ���� �޼ҵ带 �����Ѵ�.
		
		// �߻� Ŭ�󽺴� ��ü�� ���� �� ����. aaa = new Animal();
		
		
		int a;
		a = (int) 3.1; //����ȯ(type casting)
		
	}
}
