
public class Animal {
	//�ʵ�
	public String name; //����� ���� public���� ����
	//������
	public Animal(String name) {
		this.name = name;
	}
	//�޼ҵ�
	public void sing() {
		System.out.println(name + " sing");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
