import java.awt.FlowLayout; // setLayout(new FlowLayout()); ���鼭 �߰�
//import javax.swing.JButton;
//import javax.swing.JFrame;
import javax.swing.*;//Swing�� �ִ� ��� ��Ű�� ����Ʈ
//������ ����� �ι�° ���: JFrame���κ��� ��ӹ��� Ŭ�󽺸� �����.
public class MyFrame extends JFrame {
	MyFrame() {
		this.setSize(900, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois 2nd frame");
		
		//���ο� ������Ʈ�� �����ӿ� �߰�
		//this.setLayout(new FlowLayout());//�Ʒ� �� ���� �� �ٷ� ǥ���� �� //�÷ο� ��ġ �Ŵ��� ���
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);
		
		JLabel label = new JLabel("�� �ڸ� ������ �Է��ϼ���: ");//���̺� ��ü ����
		JTextField tf = new JTextField(20);//�ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton("chois button");//��ư ��ü ����
		
		
		button.setText("Ȯ��");
		tf.setText("0000"); // ���� ��κ��� ������Ʈ�� getText, setText�� ���ǵǾ� �ִ�.
		
		//�г� ����
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		//setLayout -> ������Ʈ�� �����̳ʿ� �߰��� �� ������ �� ��� ��ġ���� ��� ����
		//������������ �����ؼ� ���� ���� �ְ�
		//2 by 3 matrix�� ������ �� grid�� ���� ���� ���� �ִ�
		//���� �⺻���� ����� ���� ��ġ�Ǵ� ��ó�� �׳� �� ������� (=> FlowLayout): ������ �������� ������ �˾Ƽ� ���� �ٷ� �Ѿ
		//add �ۼ��� �� ������� ��ġ�Ǳ� ������ add�ۼ� ���� �߿�
		this.add(panel);
		this.add(button);//��ư ��ü�� �����ӿ� �߰�
//		this.add(label);//���̺� ��ü�� �����ӿ� �߰�
//		this.add(tf);//�ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
		
//		pack();//�����ӻ���� ������Ʈ ����� �°� �ڵ� ���� (������Ʈ���� �� ä���� ������ ũ�⸦ ����)
		
		this.setVisible(true);
	}

}
