package sjm;

public class Dog extends Animal {
	public Dog() {// Default Constructor(����Ʈ ������)
//		super(); -> explicit (�����) / �� ���൵ �˾Ƽ� ���ư� = implicit
		System.out.println("Dog ����Ʈ ������");
	}
	public Dog(int a) {
//		super(); -> explicit (�����) / �� ���൵ �˾Ƽ� ���ư� = implicit
		super(a);
		System.out.println("Dog ������ ������");
	}
}
