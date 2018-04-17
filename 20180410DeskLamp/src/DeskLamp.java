
public class DeskLamp {
	//필드
	private boolean isOn; //boolean 타입 변수는 대부분 is로 시작 (Is it on? 물어보는 거 -> 대답: yes or no)
	
	//메소드
	public void turnOn() {
		this.isOn = true;
	}
	
	public void turnOff() {
		this.isOn = false;
	}
	
	public String toString() {
		if(isOn)
			return "켜져있습니다.";
		else
			return "꺼져있습니다.";
	}
}
