
public class TestPoint {

	public static void main(String[] args) {
		
		Point pnt1 = new Point();
		pnt1.setX(1.0); pnt1.setY(1.0);
		
		Point pnt2 = new Point();
		pnt2.setX(2.0); pnt2.setY(2.0);
		
		//pnt1.print();
		//pnt2.print();
		//System.out.println("(" + pnt.getX() + ", " + pnt.getY() + ")");		
		String str = pnt1.toString();
		System.out.println(str);
		System.out.println(pnt1); //�Ű������� string�� �ƴϸ� �˾Ƽ� toString �޼ҵ� �ҷ��� string �����
		System.out.println(pnt2);
		System.out.println(pnt2.distance());
		//method overloading: �޼ҵ� �̸��� ����������, �Ű������� ȣ���� �޼ҵ带 ������ �� �ִ�.
		System.out.println(pnt2.distance(pnt1));
		
		

	}

}��
