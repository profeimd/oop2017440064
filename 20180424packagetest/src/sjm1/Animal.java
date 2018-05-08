package sjm1;

public class Animal {
	public String publicField;
	private String privateField;
	String packageField;// Ÿ ��Ű�������� private. Ÿ ��Ű�� Ŭ�󽺿����� ��� ���� �� ����.
	
	//protected: ����Ű ���ο� ������� ��ӵ� (package ���������� Ÿ ��Ű������ ��� �� �ƾ���)
	// ���� ��Ű�� �������� public, Ÿ ��Ű�������� private (�� �κ��� package member�� ����)
	protected String protectedField;
	
	public Animal() {
		publicField = "public";
		privateField = "private";
		packageField = "package";
		protectedField = "protected";
	}

}
