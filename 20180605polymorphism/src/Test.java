
public class Test {

	public static void main(String[] args) {
		Animal aDog = new Dog("Tina");//upcasting
		Animal aCat = new Cat("망고");//upcasting
		aDog.sing();
//error		aDog.playFetch();
		Dog gae = (Dog) aDog;//downcasting
		gae.playFetch();
		((Dog) aDog).playFetch();//downcasting: 참조변수의 타입이 Animal에서 Dog로 바꾸는 것
//error		aDog.playFetch(); -> 위에 문장 돌아가는 동안만 downcasting되고 다시 Animal됨
//컴파일 error		((Cat) aDog).playFetch(); //애초에 Cat에는 playFetch()가 없기 때문에 컴파일 error
//		aCat = new Dog("해피"); //#15의 error를 없애기 위한 문장
//런타임 error		((Dog) aCat).playFetch();
				//#14 없는 경우 Cat 가리키고 있어서 에러 뜸.
				//Dog에 playFetch() 있으니 문법 상으로는 오류 없음. -> 컴파일 에러는 뜨지 않음.
				//하지만, 실제 돌아갈 때 한 줄 한 줄 내려가면 Cat 가리키고 있는 걸 인지하면서 런타임 에러 뜨게 되는 것.
				//downcasting은 함부러 사용하면 안 된다.
		aCat.sing();
	}

}
