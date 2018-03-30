
public class Testing {

	public static void main(String[] args) {
		int a = 10;// int형의 변수 a 생성 + 값 10을 a에 저장
		//string 객체 생성 방법
		String str;//클라스 스트링의 객체를 참조할 수 있는 참조 변수(레퍼런스 변수) 생성
		str = new String("Hello darkness my old friend.");//객체 생성
		
		//String 객체의 길이
		//메소드 호출 방법: 참조변수.메소드() //참조변수는 Object를 가리키고 있음(주소를 갖고 있음)
		int len = str.length();
		System.out.println("string length is " + len);
			
		String str1;
		str1 = str.toUpperCase();
		System.out.println("str1: " + str1);

	}

}
