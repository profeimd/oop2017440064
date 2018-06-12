import java.util.*;

public class Sweep {
	
	public static void main(String[] args) {
		Set<String> strs;
		//strs = new HashSet<>();//����Ŭ���� HashSet: �ؽ��Լ� ������(��, ���� �� �� ����)
		//strs = new TreeSet<>();//����Ŭ���� TreeSet: ���ĺ������� ���ĵǾ� ����
		strs = new LinkedHashSet<>();//����Ŭ���� LinkedHashSet: �Է¼�����
		
		//�⺻�� �޼ҵ� add(), remove(), sweep...
		strs.add("trump");
		strs.add("jungeun");
		strs.add("jaein");
		strs.add("joonpyo");
		
		//ù ��° �ȴ� ���: iterator ���
		Iterator<String> e = strs.iterator();// (������ �������̽�) �÷��� ���θ� �ȴ� ����
		while(e.hasNext()) {//������ �ȴ�
			String str = e.next();//�ϳ��� ������.
			System.out.println(str);
		}
		
		//�� ��° �ȴ� ���: for() �ݺ��� ���
		for (String str1: strs) {//for (���Ÿ�� ��������: �ݷ��Ǻ���)
			System.out.println(str1);
		}
		
		
	}
	

}
