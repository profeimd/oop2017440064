import java.util.Scanner;

public class Six {

	public static void main(String[] args) {
		// 6번
		System.out.println("6번");
		
		int a, b, c;
		
		System.out.print("두 자리 정수를 입력하세요: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = a/10;
		c = a%10;
		
		if(b==c)
			System.out.println("입력한 수의 자릿수 순서를 서로 바꾼 수는 " + a + "입니다.");
		else
			System.out.println("입력한 수의 자릿수 순서를 서로 바꾼 수는 " + (c*10+b) + "입니다.");
		
		System.out.println("==========프로그램 종료==========");
	}

}
