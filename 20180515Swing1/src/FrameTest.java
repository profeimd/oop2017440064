import javax.swing.JFrame; //javax.swing ��Ű�� ���� JFrame�̶�� Ŭ��

public class FrameTest {

	public static void main(String[] args) {
		JFrame frame = new JFrame("chois frame");
		frame.setSize(900, 500); //�ȼ�����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// 'X'��ư ������ â ����
		//JFrame.EXIT_ON_CLOSE: Ŭ����.���� -> Static variable (���� ���� �빮�� �ۼ� = final ����(���))
		frame.setVisible(true);//ȭ�鿡 ��Ÿ������.

	}

}
