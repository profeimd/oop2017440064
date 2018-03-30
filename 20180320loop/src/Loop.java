
public class Loop {

	public static void main(String[] args) {
		// 1~10 정수를 화면에 출력
		int i; // i는 루프변수
		i = 1; // 1. 루프변수 초기화
		while (i<=10) { // 2. 루프 조건식
			System.out.println(i); // 3. 루프문
			i++; // 4. 루프변수 변화
		}
		
		//위의 while문을 for문으로 변환 (while문이 더 일반적임, 모든 경우 표현 가능 / for문은 표현 힘든 경우도 있음)
		for (i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		
		// 1~10 정수의 합 화면에 출력
		int sum = 0;
		i = 1; // 1. 루프변수 초기화
		while (i<=10) { // 2. 루프 조건식
			sum = sum + i; // 3. 루프문
			i++; // 4. 루프변수 변화
		}
		System.out.println("Sum = " + sum);
		
		
		//문장에서 l의 개수 구하기
		String str = "hello darkness my old friend";
		int count = 0;
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) != 'l')
				continue;
			count++;
		}
		System.out.println("문장에서 발견한 l의 개수 " + count);
		
		System.out.println("==========프로그램 종료==========");
		
		
	}


}