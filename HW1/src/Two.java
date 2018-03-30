import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// 2번
		System.out.println("2. 하나의 정수를 입력 받아 이 수가 짝수(even number)인지 홀수(odd number)인지를 출력하는 프로그램을 작성하시오.");
		
		int a;
		
		System.out.print("정수를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		if(a%2==0)
			System.out.println(a + "는 짝수(even number)입니다.");
		else
			System.out.println(a + "는 홀수(odd number)입니다.");
		System.out.println("==========프로그램 종료==========");
		
		}
		
	}
