import java.util.Scanner;

public class Eleven {

	public static void main(String[] args) {
		// 11번
		System.out.println("11번");
		
		int a;
		
		Scanner input = new Scanner(System.in);
		System.out.print("인수를 출력하고 싶은 수를 입력하세요: ");
		a = input.nextInt();
		
		while(a != 0) {
			int i = 2;
			while(i<a-1) {
				if(a%i==0)
					System.out.print(i + " ");
				i++;
			}
			System.out.println("");
			System.out.print("인수를 출력하고 싶은 수를 입력하세요(종료를 원하시면 0을 입력해주세요.): ");
			a = input.nextInt();
		}
		
		System.out.println("==========프로그램 종료==========");

	}

}
