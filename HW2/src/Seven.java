import java.util.Scanner;

public class Seven {

	public static void main(String[] args) {
		// 7번
		System.out.println("7번");
		
		int a = 1, sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		while(a != 0) {
			System.out.print("정수를 입력하세요: ");
			a = input.nextInt();
			sum = sum + a;
			
		}
		
		System.out.println("입력된 모든 수의 총합은 " + sum + "입니다.");
		System.out.println("==========프로그램 종료==========");

	}

}
