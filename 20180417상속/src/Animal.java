
public class Animal {
	//필드
	public String name; //상속을 위해 public으로 설정
	//생성자
	public Animal(String name) {
		this.name = name;
	}
	//메소드
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
