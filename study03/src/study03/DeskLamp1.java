package study03;

public class DeskLamp1 {
	
	boolean isOn;
	
	public void turnOn() {
		isOn = true;
	}
	
	public void turnOff () {
		isOn = false;
	}
	
	public String toString() {
		return "현재 상태는 " + (isOn == true? "켜짐" : "꺼짐");
	}
}
