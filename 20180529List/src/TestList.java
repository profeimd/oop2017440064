import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //일종의 upcasting
//		List<String> list = new LinkedList<String>(); // ArrayList 대신 Linkedlist 작성해도 똑같게 작동 (알고리즘만 다를 뿐!)
//		LinkedList<String> list = new LinkedList<String>(); 라고 써도 되지만 참조변수는 인터페이스 타입으로 써주는 게 가장 좋다.
		list.add(0, "zero");
		list.add("one");
		list.add("two");
		
		list.add(1, "돌"); // 중간에 데이터 넣으면 알아서 shift 됨
		
		System.out.println(list);
		
		
		
	}

}
