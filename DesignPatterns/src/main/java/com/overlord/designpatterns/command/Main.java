package com.overlord.designpatterns.command;

import com.overlord.designpatterns.command.commands.ChannelCommand;
import com.overlord.designpatterns.command.commands.OffCommand;
import com.overlord.designpatterns.command.commands.OnCommand;

/**
 * 测试
 */
public class Main {
	
	public static void main(String[] args) {
		test();
	}
	private static void test() {

		//新建电视机
		Tv myTv = new Tv();
		//初始化3个命令
		OnCommand on = new OnCommand(myTv);
		OffCommand off = new OffCommand(myTv);
		ChannelCommand channel = new ChannelCommand(myTv, 2);

		//构建遥控器
		Control control = new Control(on,off,channel);

		//遥控器执行命令
		control.turnOn();
		control.turnOff();
		control.changeChannel();
	}
	
}
