import java.util.ArrayList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(); //������ upcasting
//		List<String> list = new LinkedList<String>(); // ArrayList ��� Linkedlist �ۼ��ص� �Ȱ��� �۵� (�˰��� �ٸ� ��!)
//		LinkedList<String> list = new LinkedList<String>(); ��� �ᵵ ������ ���������� �������̽� Ÿ������ ���ִ� �� ���� ����.
		list.add(0, "zero");
		list.add("one");
		list.add("two");
		
		list.add(1, "��"); // �߰��� ������ ������ �˾Ƽ� shift ��
		
		System.out.println(list);
		
		
		
	}

}
