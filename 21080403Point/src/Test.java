
public class Test {

	public static void main(String[] args) {

		Point p = new Point(); //����Ʈ ��ü ���� �� ���۷��� p�� ����
		
		//��ü�� �ʵ�(x, y) ����
		//p.x = 1.0;
		//p.y = 1.0;
		
		
		double temp = 1.0;
		
		p.setX(temp); //�����ڸ� ����� �ʵ尪 ����
		System.out.println("temp = " + temp);
		
		p.setY(temp);
		System.out.println(p.getX()); //p.gatX(): ������ (�޼ҵ���!)
		System.out.println(p.distance()); //p ��ü�� distance()
		// 'sout'�Է� + Ctrl + Space_bar: System.out.println(); �ڵ� �Է�
	}

}
