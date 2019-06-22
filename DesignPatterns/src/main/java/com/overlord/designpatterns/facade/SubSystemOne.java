package com.overlord.designpatterns.facade;

/*
 * @Description: 子系统（Sub System）角色
 *
 * @author MischaGeng
 * @Created Date: 2019/06/22
 * @Since JDK 1.8
 * @Title: SubSystemOne
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class SubSystemOne {
    public void startup() {
        System.out.println("SubSystemOne startup!");
    }

    public void shutdown() {
        System.out.println("SubSystemOne shutdown!");
    }
}
