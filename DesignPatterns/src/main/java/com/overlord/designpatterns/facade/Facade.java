package com.overlord.designpatterns.facade;

/*
 * @Description: 外观（Facade）角色
 *
 * @author MischaGeng
 * @Created Date: 2019/06/22
 * @Since JDK 1.8
 * @Title: Facade
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class Facade {

    private SubSystemOne subSystemOne;
    private SubSystemTwo subSystemTwo;
    private SubSystemThree subSystemThree;

    public Facade() {

        subSystemOne = new SubSystemOne();
        subSystemTwo = new SubSystemTwo();
        subSystemThree = new SubSystemThree();

    }

    public void startup() {
        System.out.println("Start the system!");
        subSystemOne.startup();
        subSystemTwo.startup();
        subSystemThree.startup();
        System.out.println("start system finished!");
    }

    public void shutdown() {
        System.out.println("Shutdown the system!");
        subSystemOne.shutdown();
        subSystemTwo.shutdown();
        subSystemThree.shutdown();
        System.out.println("Shutdown system finished!");
    }



}
