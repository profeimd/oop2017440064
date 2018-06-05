import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSing {
	List<Animal> list; //Animal�� ��ӹ��� ��� ����Ŭ������ ���� �� �ִ�.
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
//	void add(Cat ele)
//	void add(Dog ele)
//	=> �̷������� ���� override�ؾ� �Ǵ� ���� upcasting���� #10���� �� ���� ó��!
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing(); // Polymorphism!!!
		}
	}

}
