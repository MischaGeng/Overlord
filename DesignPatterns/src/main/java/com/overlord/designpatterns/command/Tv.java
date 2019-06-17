package com.overlord.designpatterns.command;

/**
 * 电视机
 */
public class Tv {

	private int currentChannel= 0;

	/**
	 * 行动方法 开机
	 */
	public void turnOn(){
		System.out.println("The television is on.");
	}
	/**
	 * 行动方法 关机
	 */
	public void turnOff(){
		System.out.println("the television is off.");
	}
	/**
	 * 行动方法 换台
	 */
	public void changeChannel(int channel){
		currentChannel = channel;
		System.out.println("Now TV channel is" + channel);
	}
}

