package com.overlord.designpatterns.facade;

/*
 * @Description: 客户（Client）角色
 *
 * @author MischaGeng
 * @Created Date: 2019/06/22
 * @Since JDK 1.8
 * @Title: ClientTest
 * @ProjectName overlord
 *
 * @Modified by:
 * @Modified date:
 * @Problem no:
 */
public class ClientTest {
    public static void main(String[] args) {

        Facade facade = new Facade();
        facade.startup();
        facade.shutdown();
    }
}
