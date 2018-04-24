package sjm1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;// Ÿ ��Ű�������� private. Ÿ ��Ű�� Ŭ�󽺿����� ��� ���� �� ����.
	
	//protected: ����Ű ���ο� ������� ��ӵ�
	// ���� ��Ű�� �������� public
	// Ÿ ��Ű�������� private (package ���������� Ÿ ��Ű������ ��� �� �ƾ���)
	protected String protectedField;
	
	public Animal() {
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}
