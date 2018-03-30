import java.util.Scanner;

public class TwentyOne {

	public static void main(String[] args) {
		// 21번
		System.out.println("21번");
		
		int i, p, sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		p = input.nextInt();
		
		while(p>=2) {
			i = 2;
			while(i<p) {
				if(p%i==0)
					break;
				i++;
			}
			if(i==p)
				sum = sum + p;
			p--;
		}
		
		System.out.println("입력한 숫자 이하의 모든 소수의 합은 " + sum + "입니다.");
		
		System.out.println("==========프로그램 종료==========");

	}

}
