
public class TwentyThree {

	public static void main(String[] args) {
		// 23��
		System.out.println("23��");
		
		int i, j;
		
		for(i=5; i>=1; i-=2) {
			for(j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.print(" ");
			for(j=1; j<=6-i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		System.out.println("==========���α׷� ����==========");

	}

}
