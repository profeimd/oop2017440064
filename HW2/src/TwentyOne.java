import java.util.Scanner;

public class TwentyOne {

	public static void main(String[] args) {
		// 21��
		System.out.println("21��");
		
		int i, p, sum = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
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
		
		System.out.println("�Է��� ���� ������ ��� �Ҽ��� ���� " + sum + "�Դϴ�.");
		
		System.out.println("==========���α׷� ����==========");

	}

}
