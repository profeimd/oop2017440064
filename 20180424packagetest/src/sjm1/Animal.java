package sjm1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;// 타 패키지에서는 private. 타 패키지 클라스에서는 상속 받을 수 없다.
	
	//protected: 패지키 여부와 상관없이 상속됨
	// 동일 패키지 내에서는 public
	// 타 패키지에서는 private (package 접근지정은 타 패키지에서 상속 안 됐었음)
	protected String protectedField;
	
	public Animal() {
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}
