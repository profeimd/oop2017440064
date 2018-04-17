
public class Car {
	//Fields
	private String color;
	private int speed;
	
	public static int numberOfCars = 0; //���� ����(static field, class field): ��� ��ü�� ��Ʋ� �ϳ��� �ִ� ����
	
	//Constructor (������): �޼ҵ���� Ŭ�� �̸��� ����. ��ȯ���� ����.
	//���� �����ڸ� �������� ������ �Ű����� ���� �����ڸ� �ڹٿ��� �ڵ����� �������ش�.
	//������, �����ڸ� �ϳ��� �����ϸ� �ڹٴ� �ƹ� �ϵ� ���� �ʴ´�.
	public Car(String color, int speed) {
		 this.color = color;
		 this.speed = speed;
		 numberOfCars++;
	 }
	
	public Car() {
		this.color = "White";
		this.speed = 60;
		numberOfCars++;
	}
	//methods
	public static void print() {
		//���� �޼ҵ�� ���� ������ ������ �� �ִ�.
//		System.out.println(this.color + ", " + this.speed); error
		System.out.println(numberOfCars);
	}
	public String toString( ) {
		return ("Color is " + this.color + ". Speed is " + this.speed);
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	

}
