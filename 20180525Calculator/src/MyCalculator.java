import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyCalculator extends JFrame implements ActionListener {

	private Integer operand1; //int: primitive type //Integer: reference type
	private Integer operand2;
	private Integer operand3;

	private JButton button0;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JButton button6;
	private JButton button7;
	private JButton button8;
	private JButton button9;
	private JButton buttonC;
	private JButton buttonP;
	private JButton buttonE;
	private JTextField calcTextfield;

	public MyCalculator() {

		//연산자 초기화
		this.operand1 = new Integer(0);
		this.operand2 = 0;
		this.operand3 = 0;

		//프레임 초기화
		this.setSize(200, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("chois Calculator");

		//새로운 컴포넌트를 프레임에 추가
		FlowLayout f1 = new FlowLayout();
		this.setLayout(f1);

		this.button0 = new JButton("0");
		this.button1 = new JButton("1");
		this.button2 = new JButton("2");
		this.button3 = new JButton("3");
		this.button4 = new JButton("4");
		this.button5 = new JButton("5");
		this.button6 = new JButton("6");
		this.button7 = new JButton("7");
		this.button8 = new JButton("8");
		this.button9 = new JButton("9");
		this.buttonC = new JButton("C");
		this.buttonP = new JButton("+");
		this.buttonE = new JButton("=");
		this.calcTextfield = new JTextField(10);

		//버튼 액션리스너 추가
		this.button0.setActionCommand("0");
		this.button1.setActionCommand("1");
		this.button2.setActionCommand("2");
		this.button3.setActionCommand("3");
		this.button4.setActionCommand("4");
		this.button5.setActionCommand("5");
		this.button6.setActionCommand("6");
		this.button7.setActionCommand("7");
		this.button8.setActionCommand("8");
		this.button9.setActionCommand("9");
		this.buttonC.setActionCommand("C");
		this.buttonP.setActionCommand("+");
		this.buttonE.setActionCommand("=");

		//버튼의 액션리스너 등록
		this.button0.addActionListener(this);
		this.button1.addActionListener(this);
		this.button2.addActionListener(this);
		this.button3.addActionListener(this);
		this.button4.addActionListener(this);
		this.button5.addActionListener(this);
		this.button6.addActionListener(this);
		this.button7.addActionListener(this);
		this.button8.addActionListener(this);
		this.button9.addActionListener(this);
		this.buttonC.addActionListener(this);
		this.buttonP.addActionListener(this);
		this.buttonE.addActionListener(this);

		//프레임에 JComponent 추가
		this.add(calcTextfield);
		this.add(buttonE);
		this.add(button1);
		this.add(button2);
		this.add(button3);
		this.add(button4);
		this.add(button5);
		this.add(button6);
		this.add(button7);
		this.add(button8);
		this.add(button9);
		this.add(buttonC);
		this.add(button0);
		this.add(buttonP);

		//		pack();

		this.setVisible(true);

	}





	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "0":
			this.calcTextfield.setText(this.calcTextfield.getText() + "0");
			break;
		case "1":
			this.calcTextfield.setText(this.calcTextfield.getText() + "1");
			break;
		case "2":
			this.calcTextfield.setText(this.calcTextfield.getText() + "2");
			break;
		case "3":
			this.calcTextfield.setText(this.calcTextfield.getText() + "3");
			break;
		case "4":
			this.calcTextfield.setText(this.calcTextfield.getText() + "4");
			break;
		case "5":
			this.calcTextfield.setText(this.calcTextfield.getText() + "5");
			break;
		case "6":
			this.calcTextfield.setText(this.calcTextfield.getText() + "6");
			break;
		case "7":
			this.calcTextfield.setText(this.calcTextfield.getText() + "7");
			break;
		case "8":
			this.calcTextfield.setText(this.calcTextfield.getText() + "8");
			break;
		case "9":
			this.calcTextfield.setText(this.calcTextfield.getText() + "9");
			break;
		case "C":
			this.calcTextfield.setText("");
			break;
		case "+":
			this.calcTextfield.setText(this.calcTextfield.getText() + "+");
			break;
		case "=":
			String result = calculating(this.calcTextfield.getText());
			this.calcTextfield.setText(this.calcTextfield.getText() + "=" + result);
			break;
		default:
			break;
		}

	}
	
	private String calculating(String text) {
		String[] tokens = text.split("\\+");
		operand1 = Integer.parseInt(tokens[0]);
		operand2 = Integer.parseInt(tokens[1]);
		return Integer.toString(operand1+operand2);
	}
	

	public static void main(String[] args) {
		new MyCalculator();

	}
}
