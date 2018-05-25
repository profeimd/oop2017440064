import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator extends JFrame implements ActionListener {
	
	JTextArea txt;
	JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnEqual, btnClear;
	JPanel pan1, pan2, pan3, pan4;
	int count = 0;
	int[] temp  = new int[] {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int n = 0;
	int augend = 0;
	int addend = 0;
	int sum = 0;
	
	
	
	Calculator() {
		this.setSize(300, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Calculator");
		
		this.setLayout(new FlowLayout());

		txt = new JTextArea(1, 20);
		this.add(txt);
		
//버튼 객체 생성 및 프레임 추가, 이벤트 리스너 등록		
		
		this.btn7 = new JButton("7");
		this.btn7.setActionCommand("b7");
		btn7.addActionListener(this);
		
		this.btn8 = new JButton("8");
		this.btn8.setActionCommand("b8");
		btn8.addActionListener(this);
		
		this.btn9 = new JButton("9");
		this.btn9.setActionCommand("b9");
		btn9.addActionListener(this);
		
		this.btn4 = new JButton("4");
		this.btn4.setActionCommand("b4");
		btn4.addActionListener(this);
		
		this.btn5 = new JButton("5");
		this.btn5.setActionCommand("b5");
		btn5.addActionListener(this);
		
		this.btn6 = new JButton("6");
		this.btn6.setActionCommand("b6");
		btn6.addActionListener(this);
		
		this.btn1 = new JButton("1");
		this.btn1.setActionCommand("b1");
		btn1.addActionListener(this);

		this.btn2 = new JButton("2");
		this.btn2.setActionCommand("b2");
		btn2.addActionListener(this);
		
		this.btn3 = new JButton("3");
		this.btn3.setActionCommand("b3");
		btn3.addActionListener(this);
		
		
		this.btn0 = new JButton("0");
		this.btn0.setActionCommand("b0");
		btn0.addActionListener(this);		
		
		this.btnPlus = new JButton("+");
		this.btnPlus.setActionCommand("b+");
		btnPlus.addActionListener(this);
		
		this.btnEqual = new JButton("=");
		this.btnEqual.setActionCommand("b=");
		btnEqual.addActionListener(this);
		
		this.btnClear = new JButton("C");
		this.btnClear.setActionCommand("bC");
		btnClear.addActionListener(this);
		
		
		
//버튼들 Panel로 묶어서 일반적인 계산기 형태로 시각화
		
		this.pan1 = new JPanel();
		pan1.add(btn7);
		pan1.add(btn8);
		pan1.add(btn9);
		this.add(pan1);
		
		this.pan2 = new JPanel();
		pan2.add(btn4);
		pan2.add(btn5);
		pan2.add(btn6);
		this.add(pan2);

		this.pan3 = new JPanel();
		pan3.add(btn1);
		pan3.add(btn2);
		pan3.add(btn3);
		this.add(pan3);

		this.pan4 = new JPanel();
		pan4.add(btn0);
		pan4.add(btnPlus);
		pan4.add(btnEqual);
		pan4.add(btnClear);
		this.add(pan4);
		
		
		
		this.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {//이벤트 처리기
		if((e.getActionCommand()).equals("b1")) {
			this.txt.append("1");
			temp[count] = 1;
			count++;
		}
		else if((e.getActionCommand()).equals("b2")) {
			this.txt.append("2");
			temp[count] = 2;
			count++;
		}
		else if((e.getActionCommand()).equals("b3")) {
			this.txt.append("3");
			temp[count] = 3;
			count++;
		}
		else if((e.getActionCommand()).equals("b4")) {
			this.txt.append("4");
			temp[count] = 4;
			count++;
		}
		else if((e.getActionCommand()).equals("b5")) {
			this.txt.append("5");
			temp[count] = 5;
			count++;
		}
		else if((e.getActionCommand()).equals("b6")) {
			this.txt.append("6");
			temp[count] = 6;
			count++;
		}
		else if((e.getActionCommand()).equals("b7")) {
			this.txt.append("7");
			temp[count] = 7;
			count++;
		}
		else if((e.getActionCommand()).equals("b8")) {
			this.txt.append("8");
			temp[count] = 8;
			count++;
		}
		else if((e.getActionCommand()).equals("b9")) {
			this.txt.append("9");
			temp[count] = 9;
			count++;
		}
		else if((e.getActionCommand()).equals("b0")) {
			this.txt.append("0");
			temp[count] = 0;
			count++;
		}
		
		
		else if((e.getActionCommand()).equals("b+")) {
			this.txt.append("+");
			while(count>=0) {
				augend += (int) (Math.pow(10, (count-1))*temp[n]);
				n++;
				count--;
			}
			n = 0;
			count = 0;
		}
		
		
		else if((e.getActionCommand()).equals("b=")) {
			while(count>=0) {
				addend += (int) (Math.pow(10, (count-1))*temp[n]);
				n++;
				count--;
			}
			sum = augend + addend;
			String to = Integer.toString(sum);
			this.txt.append("=" + to);
		}
		
		
		else if((e.getActionCommand()).equals("bC")) {
			txt.setText("");
			n = 0;
			count = 0;
			augend = 0;
			addend = 0;
			sum = 0;
		}
	}
}
