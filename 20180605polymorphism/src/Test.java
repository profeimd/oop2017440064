
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");//upcasting
		Animal aCat = new Cat("����");//upcasting
		aDog.sing();
//error		aDog.playFetch();
		Dog gae = (Dog) aDog;//downcasting
		gae.playFetch();
		((Dog) aDog).playFetch();//downcasting: ���������� Ÿ���� Animal���� Dog�� �ٲٴ� ��
//error		aDog.playFetch(); -> ���� ���� ���ư��� ���ȸ� downcasting�ǰ� �ٽ� Animal��
//������ error		((Cat) aDog).playFetch(); //���ʿ� Cat���� playFetch()�� ���� ������ ������ error
//		aCat = new Dog("����"); //#15�� error�� ���ֱ� ���� ����
//��Ÿ�� error		((Dog) aCat).playFetch();
				//#14 ���� ��� Cat ����Ű�� �־ ���� ��.
				//Dog�� playFetch() ������ ���� �����δ� ���� ����. -> ������ ������ ���� ����.
				//������, ���� ���ư� �� �� �� �� �� �������� Cat ����Ű�� �ִ� �� �����ϸ鼭 ��Ÿ�� ���� �߰� �Ǵ� ��.
				//downcasting�� �Ժη� ����ϸ� �� �ȴ�.
		aCat.sing();
	}

}
