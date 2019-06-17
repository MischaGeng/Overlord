package com.overlord.designpatterns.command.commands;

import com.overlord.designpatterns.command.Tv;

/**
 * 换台命令
 */
public class ChannelCommand implements Command {

	//电视
	private Tv myTv;
	//频道
	private int channel;

	//构造方法
	public ChannelCommand(Tv tv,int channel){
		myTv = tv;
		this.channel = channel;
	}

	/**
	 * 执行方法
	 */
	@Override
	public void execute() {
		myTv.changeChannel(channel);;
	}
}
