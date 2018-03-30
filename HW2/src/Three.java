
public class Three {

	public static void main(String[] args) {
		// 3번
		System.out.println("3번");
		
		int i=3, sum=0;
		
		while(i<=100) {
			sum = sum + i;
			i = i+3;
		}
		
		System.out.println("Sum = " + sum);
		System.out.println("==========프로그램 종료==========");

	}

}
