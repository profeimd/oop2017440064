
public class Testing {

	public static void main(String[] args) {
		int a = 10;// int���� ���� a ���� + �� 10�� a�� ����
		//string ��ü ���� ���
		String str;//Ŭ�� ��Ʈ���� ��ü�� ������ �� �ִ� ���� ����(���۷��� ����) ����
		str = new String("Hello darkness my old friend.");//��ü ����
		
		//String ��ü�� ����
		//�޼ҵ� ȣ�� ���: ��������.�޼ҵ�() //���������� Object�� ����Ű�� ����(�ּҸ� ���� ����)
		int len = str.length();
		System.out.println("string length is " + len);
			
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: " + str1);

	}

}
