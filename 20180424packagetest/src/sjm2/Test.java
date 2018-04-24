package sjm2;

import sjm1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
//		aBail.age = 2; Error age is a private field.
		
		//타 패키지의 클라스를 사용하려면
		//1. 패키지명.클라스명
		//sjm1.Dog aDog =new sjm1.Dog();
		
		//2. import 명령어 사용 (#3: 그 패키지에 있는 class들을 모두 사용하고 싶을 때 **주의** package 아래에 작성해야 함.)
		Dog aDog = new Dog();
		aDog.name = "happy";
//		aDog.IDN = "23232"; Error
//		aDog.nickName = "kk"; Error nickName은 패키지 접근지정(패키지 접근지정해주면 import 써도 다른 패키지에서 사용 불가)
		Animal aa = new Animal();
//		aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
//		rr.protectedField = "tt"; : Rosemary.java보면 상속은 받았는데 여기 Test.java에서 Access는 안 됨.
		//즉, 상속받아서 값은 있지만 private처럼 수정은 할 수 없음.
		
		
		
	}

}
