import java.awt.FlowLayout; // setLayout(new FlowLayout()); 쓰면서 추가
//import javax.swing.JButton;
//import javax.swing.JFrame;
import javax.swing.*;//Swing에 있는 모든 패키지 임폴트
//프레임 만드는 두번째 방법: JFrame으로부터 상속받은 클라스를 만든다.
public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(900, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois 2nd frame");
		
		//새로운 컴포넌트를 프레임에 추가
		//this.setLayout(new FlowLayout());//아래 두 줄을 한 줄로 표현한 식 //플로우 배치 매니저 사용
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		
		JLabel label = new JLabel("네 자리 정수를 입력하세요: ");//레이블 객체 생성
		JTextField tf = new JTextField(20);//텍스트필드 객체 생성
		JButton button = new JButton("chois button");//버튼 객체 생성
		
		
		button.setText("확인");
		tf.setText("0000"); // 거의 대부분의 컴포넌트는 getText, setText가 정의되어 있다.
		
		//패널 생성
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		//setLayout -> 컴포넌트를 컨테이너에 추가할 때 프레임 상에 어떻게 배치할지 방법 설정
		//동서남북으로 구분해서 넣을 수도 있고
		//2 by 3 matrix로 나눠서 각 grid에 집어 넣을 수도 있다
		//가장 기본적인 방법은 지금 배치되는 것처럼 그냥 쭉 순서대로 (=> FlowLayout): 윈도우 프레임이 작으면 알아서 다음 줄로 넘어감
		//add 작성해 준 순서대로 배치되기 때문에 add작성 순서 중요
		this.add(panel);
		this.add(button);//버튼 객체를 프레임에 추가
//		this.add(label);//레이블 객체를 프레임에 추가
//		this.add(tf);//텍스트필드 객체를 프레임에 추가
		
//		pack();//프레임사이즈를 컴포넌트 사이즈에 맞게 자동 수정 (컴포넌트들을 꽉 채워서 프레임 크기를 정함)
		
		this.setVisible(true);
	}

}
