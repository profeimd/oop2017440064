import javax.swing.JFrame; //javax.swing 패키지 안의 JFrame이라는 클라스

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("chois frame");
		frame.setSize(900, 500); //픽셀단위
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 'X'버튼 누르면 창 종료
		//JFrame.EXIT_ON_CLOSE: 클래스.변수 -> Static variable (변수 전부 대문자 작성 = final 변수(상수))
		frame.setVisible(true);//화면에 나타나도록.

	}

}
