
public class Point {
	//Fields
	private double x;
	private double y;
	
	//Methods
	public String toString() {
		return ( "(" + this.x + ", " + this.y + ")" ); //this.x, this.y: double -> �˾Ƽ� string���� ��ȭ
	}
	
	public void print() {
		//System.out.println("(" + this.getX() + ", " + this.getY() + ")"); -> ���� Ŭ���� �޼ҵ� ��� ����
		System.out.println("(" + this.x + ", " + this.y + ")"); //this �� �־�� �ϴ� �� �ƴ�
							// �׸��� ���⼭�� this.x�� �ٷ� toString ���� ���� �� -> primitive (double) type�̱� ���� -> �˾Ƽ� reference (double) type���� �ٲ��ְ� toString ����
							// toString�� ��ȯ���� String�̱� ������ primitive type�� �Ű������� ������ �ߴ� ��! String�� reference �������� ��!
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
