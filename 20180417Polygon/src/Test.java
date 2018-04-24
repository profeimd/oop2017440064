
public class Test {
	
	public static void main(String[] args) {
		Triangle tri = new Triangle();
		tri.height = 2.0;
		tri.width = 3.0;
		System.out.println(tri.area());
		
		Rectangle rec = new Rectangle();
		rec.height = 2.0;
		rec.width = 3.0;
		System.out.println(rec.area());
		
//error		new Polygon(); // 추상 클래스는 객체 생성 할 수 없다.
		
		
	}
}