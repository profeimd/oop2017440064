import java.util.*;

public class TestQueue {
	
	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<> ();
		Queue<String> strs = new PriorityQueue<> ();//���ĺ� ������ �����
		strs.add("Ʈ����");//ť �� ���� ��Ҹ� �߰�
		strs.add("����");
		strs.add("���̴�");
		strs.add("��ǥ");
		String str2;
		
		while (!strs.isEmpty()) {
			str2 = strs.remove();//ť �� �տ��� ��Ҹ� �����Ͽ� �� ��Ҹ� ��ȯ
			System.out.println(str2);
			Thread.sleep(1000);//�޼ҵ忡 throws InterruptedExcption �ʿ�
		}
		
	}

}
