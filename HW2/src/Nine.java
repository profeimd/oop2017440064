import java.util.Scanner;

public class Nine {

	public static void main(String[] args) {
		// 9번
		System.out.println("9번");

		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.print("출력하고 싶은 구구단의 단수를 입력하세요: ");
		a = input.nextInt();
		
		while(a<1 || a>9) {
			System.out.print("1에서 9 사이의 정수만 입력해주세요: ");
			a = input.nextInt();
			continue;
		}
		
		int i = 1;
		
		while(i<10) {
			System.out.println(a + "X" + i + " = " + a*i);
			i++;
		}
		
		System.out.println("==========프로그램 종료==========");
		
	}

}
