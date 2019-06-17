package com.overlord.designpatterns.command.commands;


import com.overlord.designpatterns.command.Tv;

/**
 * 关机命令
 */
public class OffCommand implements Command {

	private Tv myTv;

	//构造方法，传入电视机参数
	public OffCommand(Tv tv){
		myTv = tv;
	}

	/**
	 * 执行方法 关机
	 */
	@Override
	public void execute() {
		myTv.turnOff();
	}
}
