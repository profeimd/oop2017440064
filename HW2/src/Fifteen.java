import java.util.Scanner;

public class Fifteen {

	public static void main(String[] args) {
		// 15번
		System.out.println("15번");
		
		double random = Math.random();
		int intrandom = (int)(random*100)+1;
		
		int a, i=1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("1~100 사이의 숫자를 맞추는 게임입니다(기회 10번).");
		
		while(i<=10) {
			System.out.print("숫자를 입력하시오: ");
			a = input.nextInt();
			if(a>intrandom)
				System.out.println("입력하신 숫자보다 작습니다.");
			else if(a<intrandom)
				System.out.println("입력하신 숫자보다 큽니다.");
			else {
				System.out.println("정답입니다!");
				break;
			}
			i++;
		}
		
		if(i==11)
			System.out.println("Game Over.");
		
		System.out.println("==========프로그램 종료==========");
		

	}

}
