package sjm1;

public class Dog extends Animal {
	public String name;
	private String IDN;
	String nickName; //접근 지정자 없음. -> package 접근지정(access control): 패키지 내에서만 public
	void print() {
		System.out.println(publicField);
//		System.out.println(privateField);
		System.out.println(packageField);
		System.out.println(protectedField);
	}

}
