import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
//ù��° �̺�Ʈ ������ ���� ���
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {//�̺�Ʈ ó����
		JButton button = (JButton) e.getSource();//�׼��̺�Ʈ ��ü���� ������ ��ư ��ü(��ư��ü�� ���۷�����)�� �����´�.
		button.setText("��ư�� ���������!!!");
		System.out.println("OMG ��ư�� ���������!!!!!");

	}

}
