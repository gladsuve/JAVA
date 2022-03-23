package kr.ac.kopo.day10.inter;

public interface TV {
	int MIN_VOLUME_SIZE = 0;
	/* public static final */int MAX_VOLUME_SIZE = 50;
	
	/*
	 * 전원을 켜는 기능
	 */
	void powerOn();
	/* public abstract */ void powerOff();
	void channelUp();
	void channelDown();
	void volumeUp();
	void volumeDown();
	void mute();
}
