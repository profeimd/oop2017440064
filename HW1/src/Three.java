import java.util.Scanner;

public class Three {

	public static void main(String[] args) {
		// 3번
		System.out.println("3. 세 수(정수형)를 입력 받아 가장 큰 수를 출력하는 프로그램을 작성하시오.");
		
		int a, b, c;
		
		Scanner input = new Scanner(System.in);
		System.out.print("첫번째 정수를 입력하시오: ");
		a = input.nextInt();
		System.out.print("두번째 정수를 입력하시오: ");
		b = input.nextInt();
		System.out.print("세번째 정수를 입력하시오: ");
		c = input.nextInt();
		
		if(a >= b && a >= c)
			System.out.println(a + "가(이) 가장 큽니다");
		else if (b >= c)
			System.out.println(b + "가(이) 가장 큽니다");
		else
			System.out.println(c + "가(이) 가장 큽니다.");
		System.out.println("==========프로그램 종료==========");

	}

}
