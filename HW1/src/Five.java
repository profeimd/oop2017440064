import java.util.Scanner;

public class Five {

	public static void main(String[] args) {
		// 5번
		System.out.println("5번");
		
		String a = "apple", b = "orange", c = "banana", d = "peach";
		
		System.out.println("Choose one of the following.");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		String menu;
		
		Scanner input = new Scanner(System.in);
		System.out.print("enter your choice here: ");
		menu = input.nextLine();
		System.out.println("--------------------");
		
		if(menu.equals(a))
			System.out.println("Your choice is apple.");
		else if (menu.equals(b))
			System.out.println("Your choice is orange.");
		else if (menu.equals(c))
			System.out.println("Your choice is banana.");
		else if (menu.equals(d))
			System.out.println("Your choice is peach.");
		else
			System.out.println("There is no menu you chose.");
		
		System.out.println("==========프로그램 종료==========");

	}

}
