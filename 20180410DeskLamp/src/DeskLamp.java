
public class DeskLamp {
	//�ʵ�
	private boolean isOn; //boolean Ÿ�� ������ ��κ� is�� ���� (Is it on? ����� �� -> ���: yes or no)
	
	//�޼ҵ�
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public String toString() {
		if(isOn)
			return "�����ֽ��ϴ�.";
		else
			return "�����ֽ��ϴ�.";
	}
}
