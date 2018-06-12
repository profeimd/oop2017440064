import java.util.*;

public class TestQueue {
	
	public static void main(String[] args) throws InterruptedException {
		//Queue<String> strs = new LinkedList<> ();
		Queue<String> strs = new PriorityQueue<> ();//알파벳 순으로 저장됨
		strs.add("트럼프");//큐 맨 끝에 요소를 추가
		strs.add("정은");
		strs.add("재이니");
		strs.add("준표");
		String str2;
		
		while (!strs.isEmpty()) {
			str2 = strs.remove();//큐 맨 앞에서 요소를 제거하여 그 요소를 반환
			System.out.println(str2);
			Thread.sleep(1000);//메소드에 throws InterruptedExcption 필요
		}
		
	}

}
