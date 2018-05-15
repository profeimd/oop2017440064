import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//첫번째 이벤트 리스너 구현 방법
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {//이벤트 처리기
		JButton button = (JButton) e.getSource();//액션이벤트 객체에서 눌려진 버튼 객체(버튼객체의 레퍼런스값)를 가져온다.
		button.setText("버튼이 눌러졌어요!!!");
		System.out.println("OMG 버튼이 눌러졌어요!!!!!");

	}

}
