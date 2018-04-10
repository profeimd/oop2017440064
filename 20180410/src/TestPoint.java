
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
		System.out.println(pnt1); //매개변수가 string이 아니면 알아서 toString 메소드 불러서 string 출력함
		System.out.println(pnt2);
		System.out.println(pnt2.distance());
		//method overloading: 메소드 이름은 동일하지만, 매개변수로 호출할 메소드를 구분할 수 있다.
		System.out.println(pnt2.distance(pnt1));
		
		

	}

}ㄷ
