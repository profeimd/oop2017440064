
public class TwentyFive1 {

	public static void main(String[] args) {
		// 25번 (1)
		System.out.println("25번 (1)");
		
		int i, j;
		
		for(i=11; i>=1; i-=2) {
			for(j=1; j<=i; j++)
				System.out.print("*");
			System.out.println("");
		}
		for(i=3; i<=11; i+=2) {
			for(j=1; j<=i; j++)
				System.out.print("*");
			System.out.println("");
		}
		
		System.out.println("==========프로그램 종료==========");
	}

}
