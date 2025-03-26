package study;

public class LgTv {
	public LgTv() {
		System.out.println("LgTv 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("LgTv 전원을 킨다.");
	}
	
	@Override
	public void powerOff() {
		System.out.println("LgTv 전원을 끈다.");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("LgTv 소리를 켠다.");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("LgTv 소리를 끈다.");
	}
}
