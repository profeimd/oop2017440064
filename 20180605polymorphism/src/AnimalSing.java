import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalSing {
	List<Animal> list; //Animal을 상속받은 모든 서브클래스를 담을 수 있다.
	AnimalSing() {
		list = new ArrayList<Animal>();
	}
	void add(Animal ele) {
		list.add(ele);
	}
//	void add(Cat ele)
//	void add(Dog ele)
//	=> 이런식으로 각각 override해야 되는 것을 upcasting으로 #10에서 한 번에 처리!
	void sing() {
		Animal ele;
		Iterator<Animal> e = list.iterator();
		while(e.hasNext()) {
			ele = e.next();
			ele.sing(); // Polymorphism!!!
		}
	}

}
