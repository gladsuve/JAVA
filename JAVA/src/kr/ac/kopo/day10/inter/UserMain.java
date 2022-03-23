package kr.ac.kopo.day10.inter;

public class UserMain {
	
	public static void main(String[] args) {
		
		TV tv = new LGTV();
		//TV tv = new SamsungTV();
		tv.powerOn();
		tv.volumeUp();
		tv.volumeDown();
		tv.channelUp();
		tv.channelDown();
		tv.powerOff();
	}

}
