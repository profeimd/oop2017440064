package sjm2;

import sjm1.*;

public class Test {

	public static void main(String[] args) {
		Basil aBasil = new Basil();
		aBasil.name = "Lily";
//		aBail.age = 2; Error age is a private field.
		
		//Ÿ ��Ű���� Ŭ�󽺸� ����Ϸ���
		//1. ��Ű����.Ŭ�󽺸�
		//sjm1.Dog aDog =new sjm1.Dog();
		
		//2. import ��ɾ� ��� (#3: �� ��Ű���� �ִ� class���� ��� ����ϰ� ���� �� **����** package �Ʒ��� �ۼ��ؾ� ��.)
		Dog aDog = new Dog();
		aDog.name = "happy";
//		aDog.IDN = "23232"; Error
//		aDog.nickName = "kk"; Error nickName�� ��Ű�� ��������(��Ű�� �����������ָ� import �ᵵ �ٸ� ��Ű������ ��� �Ұ�)
		Animal aa = new Animal();
//		aa.protectedField = "ddd";
		
		Rosemary rr = new Rosemary();
//		rr.protectedField = "tt"; : Rosemary.java���� ����� �޾Ҵµ� ���� Test.java���� Access�� �� ��.
		//��, ��ӹ޾Ƽ� ���� ������ privateó�� ������ �� �� ����.
		
		
		
	}

}
