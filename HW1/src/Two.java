import java.util.Scanner;

public class Two {

	public static void main(String[] args) {
		// 2��
		System.out.println("2. �ϳ��� ������ �Է� �޾� �� ���� ¦��(even number)���� Ȧ��(odd number)������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.");
		
		int a;
		
		System.out.print("������ �Է��ϼ���: ");
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		
		if(a%2==0)
			System.out.println(a + "�� ¦��(even number)�Դϴ�.");
		else
			System.out.println(a + "�� Ȧ��(odd number)�Դϴ�.");
		System.out.println("==========���α׷� ����==========");
		
		}
		
	}
