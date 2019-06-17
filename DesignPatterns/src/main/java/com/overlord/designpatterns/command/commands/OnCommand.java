package com.overlord.designpatterns.command.commands;

import com.overlord.designpatterns.command.Tv;

/**
 * 开机命令
 */
public class OnCommand implements Command {

	private Tv myTv;

	//构造方法，传入电视机参数
	public OnCommand(Tv tv){
		myTv = tv;
	}

	/**
	 * 执行方法 开机
	 */
	@Override
	public void execute() {
		myTv.turnOn();
	}
}
