import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		// 13번
		System.out.println("13번");
		
		int m, d;
		int sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("월과 일을 입력해주세요: ");
		m = input.nextInt();
		d = input.nextInt();
		
		switch (m) {
		case 1:
			break;
		case 2:
			sum = 31;
			break;
		case 3:
			sum = 59;
			break;
		case 4:
			sum = 90;
			break;
		case 5:
			sum = 120;
			break;
		case 6:
			sum = 151;
			break;
		case 7:
			sum = 181;
			break;
		case 8:
			sum = 212;
			break;
		case 9:
			sum = 243;
			break;
		case 10:
			sum = 273;
			break;
		case 11:
			sum = 304;
			break;
		case 12:
			sum = 334;
			break;
		}
		
		sum = sum + d;
		System.out.println("1월 1일로부터 입력하신 날짜까지 총 " + sum + "일 입니다.");
		System.out.println("==========프로그램 종료==========");

	}

}
