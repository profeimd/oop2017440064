import java.util.Scanner;

public class Nineteen {

	public static void main(String[] args) {
		// 19번
		System.out.println("19번");
		
		int i=2, p;
		
		Scanner input = new Scanner(System.in);
		System.out.print("소수 판별 하고 싶은 수를 입력하세요: ");
		p = input.nextInt();
		
		while(i<p) {
			if(p%i==0) {
				System.out.println("입력한 수는 소수가 아닙니다.");
				break;
			}
			i++;
		}
		
		if(i==p)
			System.out.println("입력한 수는 소수입니다.");
		
		System.out.println("==========프로그램 종료==========");
		

	}

}
