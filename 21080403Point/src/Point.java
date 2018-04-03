
public class Point {
	//필드의 scope(유효범위)은 클래스 내부이다.
	private double x;
	private double y;
	
	public void setX(double xx) {
		this.x = xx;
		xx = 100.0;
	}
	
	public double getX() { //상단바 - Source - Generate Getters and Setters... -> 자동 생성
		return x;
	}

	public double getY() {
		return y;
	}

	public void setY(double yy) {
		this.y = yy;
	}
	
	public double distance() {
		//반활할 변수 선언
		double result; //지역 변수의 유효범위는 메소드 내부
		
		//거리 계산
		result = Math.sqrt(x*x+y*y);
		
		//거리 반환
		return result;
	}
	
	public Point move(Point p) { //매개변수 p의 유효범위는 메소드 내부
		
		//temp 변수 선언
		double a;
		double b;
		
		//포인트 p만큼 이동
		a = this.x + p.x; //this: 이 객체의 필드로 정의한 x라고 강조하는 것 (필드의 유효범위가 클래스 전체라서 헷갈릴 수 있기 때문에 언급)
		b = this.y + p.y;
		
		//새로운 포인트 생성
		Point pnt = new Point();
		pnt.x = a;
		pnt.y = b;
		
		//새로운 포인트 반환
		return pnt;
	}

}
