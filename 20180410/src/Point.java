
public class Point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	public String toString() {
		return ( "(" + this.x + ", " + this.y + ")" ); //this.x, this.y: double -> 알아서 string으로 변화
	}
	
	public void print() {
		//System.out.println("(" + this.getX() + ", " + this.getY() + ")"); -> 같은 클라스의 메소드 사용 가능
		System.out.println("(" + this.x + ", " + this.y + ")"); //this 꼭 있어야 하는 건 아님
							// 그리고 여기서는 this.x에 바로 toString 쓰면 에러 뜸 -> primitive (double) type이기 때문 -> 알아서 reference (double) type으로 바꿔주고 toString 적용
							// toString의 반환형이 String이기 때문에 primitive type의 매개변수면 오류가 뜨는 거! String은 reference 변수여야 함!
	}
	public double distance() {
		return Math.sqrt(x*x+y*y);
	}
	//method overloading
	public double distance(Point p) {
		return Math.sqrt( (this.x-p.getX() ) * ( this.x-p.getX() ) + 
				( this.y-p.getY() ) * ( this.y-p.getY() ) );
	}
	
	
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}

}
