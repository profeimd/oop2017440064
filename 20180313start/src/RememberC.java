
public class RememberC {

	public static void main(String[] args) {
		//변수: 메모리 저장공간의 이름
		//integer: 4byte -> 4개 바이트 합쳐서 a라고 하겠다. -> 2^32 -> 2^32개의 수 표현 (범위: 아래)
		//자료형:
		// 1. 변수가 가질 수 있는 값의 범위를 정한다. -> -2^31 ~ (2^31)-1 사이의 정수값
		// 2. 변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를 정한다. -> 
		// 3. 값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수, 저장 포맷)을 정한다.
		//변수선언문
		//변수를 사용하기 위해 필요한 아래의 정보를 표현한다.
		// 1. 사용할 변수의 이름을 지정한다
		// 2. 사용할 변수의 자료형을 선언한다.
		//Java에서 변수를 사용하기 전에 반드시 변수선언을 해야 한다.
		
		int a, b;//변수 선언문: 1. a는 변수의 이름이다.   2. 변수 a의 자료형은 int이다.
		
		
		//리터럴(literal): 소스코드에서 값을 표현하는 방법 (0x로 시작하면 16진수 표현)
		//연산자: 연산을 위한 기호
		//대입연산자(=): 우변의 값을 좌변의 저장소로 이동한다. 우변의 값을 반환한다.
		//수식(Expression):
		//연산자와 피연산자들(리터럴, 변수, 수식)의 조합. 모든 수식은 값을 반환(리턴)한다.
		//부수효과(side effect): 수식이 값을 반환하는 것 이외 수행하는 모든 작업을 부수효과라 한다.
		a = 0x10;
		a = a; //좌변: 저장장소, 우변: 'a'의 값
		a = a * 10 + 20; // 연산자 우선 순위 (대입 연산자는 항상 제일 마지막)
		
		//post increment(a++): 반환값은 a, 부수효과는 a=a+1;
		b = a++;
		System.out.println("a = " + a + " b = " + b);
		//pre increment(++a): 반환값은 a+1, 부수효과는 a=a+1;
		a = 10;
		b = ++a;
		System.out.println("a = " + a + " b = " + b);
		
		//C에서는 %d 사용했었는데 여기서는 사용하지 않음.
		// "a = " + a -> 문자열, 연산자, 변수의 나열
		// 문자열에서의 더하기 연산자 -> 문자열을 오른쪽에 더 추가하라는 뜻
		// 즉 a의 값을 문자열에 더 추가해서 적으라는 얘기니까 '10'이라는 값이 나오는 것
		
		System.out.println("Hellllllo " + "there");
	// C에서의 strcat 역할 (string concatenation)
		
		
		boolean bb;
		bb = true || false;
		bb = 0>1;
		System.out.println("bb = " + bb);
		// C에서는 관계연산자에서 참(true)면 1, 거짓(false)면 0이 나왔지만 Java에서는 true, false 리터럴이 있다.
		// true, false는 C에만 없고 c++, 파이썬 등 대부분의 언어에 있는 리터럴이다.
		//Java는 부울 자료형과 true/false 리터럴을 사용한다.
		//Java에서 논리 연산자(&&, ||, !)의 피연산자는 부울 변수 또는 true, false 리터럴을 사용해야 한다.
		//관계연산자(>, <, <=, ==, !=)는 부울 값을 반환한다.
		
		final int c = 100;
//error	c는 상수	c = 1000;
		//C에서 상수 선언할 때 const 사용 -> Java에서는 final 키워드 사용: 더이상 변수 값 변경 불가, 시도하면 에러 뜸
		
		System.out.println("c = " + c);
		
		//소숫점 자료형 (float, double)
		float ff;
		double dd;
		ff = 3.14f;
		dd = 3.14; // 리터럴 "3.14"의 자료형은 double이다.
		System.out.println("ff = " + ff + "dd = " + dd);
		
		//중요!
		//형변환(casting): 유사한 자료형으로 변환한다. (string -> int, boolean -> int 이런 건 안 됨!)
		int x =10;
		double y=100.34;
		x = (int) y;//explicit casting -> 여기서는 (int)없으면 에러 (실수->정수는 정보를 잃어버리기 때문)
		y = x;//implicit casting(알아서 은연 중에 변환해 줌), y = (double) X 사용해도 됨.
		System.out.println("x = " + x + "y = " + y);
		//교수님 출력시 y = 100.34 -> 나는 왜 100.0 뜨지? 확인해보기
		
		
		
	}

}
