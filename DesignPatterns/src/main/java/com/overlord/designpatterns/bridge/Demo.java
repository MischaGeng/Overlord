package com.overlord.designpatterns.bridge;

public class Demo {

    public static void main(String[]args) {

        Brand br;

        br=new MBrand();

        br.setSoftware(new GameSoftware());

        br.run();

        br.setSoftware(new AddressListSoftware());

        br.run();

        br=new NBrand();

        br.setSoftware(new GameSoftware());

        br.run();

        br.setSoftware(new AddressListSoftware());

        br.run();

    }

}