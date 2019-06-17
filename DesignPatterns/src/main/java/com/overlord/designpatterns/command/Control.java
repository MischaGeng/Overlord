package com.overlord.designpatterns.command;

import com.overlord.designpatterns.command.commands.Command;

/**
 * 遥控器
 */
public class Control {

	//遥控器面板上的几种命令
	private Command onCommand,offCommand,changeChannel;

	//构造遥控器方法
	public Control(Command on, Command off, Command channel){
		onCommand = on;
		offCommand = off;
		changeChannel = channel;
	}
	/**
	 * 行动方法 打开电视机
	 */
	public void turnOn(){
		onCommand.execute();
	}
	/**
	 * 行动方法 关闭电视机
	 */
	public void turnOff(){
		offCommand.execute();
	}
	/**
	 * 行动方法 换频道
	 */
	public void changeChannel(){
		changeChannel.execute();
	}
}
