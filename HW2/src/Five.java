
public class Five {

	public static void main(String[] args) {
		// 5번
		System.out.println("5번");
		
		int i=3, sum=0;
		
		do {
			sum = sum + i;
			i = i+3;
		} while(i<=100);
		
		System.out.println("Sum = " + sum);
		System.out.println("==========프로그램 종료==========");

	}

}
