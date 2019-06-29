package com.overlord.designpatterns.mediator;

public class TestMediator {
    public static void main(String[] args) {
        HouseMediator houseMediator = new HouseMediator();
        HouseBuyer houseBuyer = new HouseBuyer(houseMediator);
        HouseSeller houseSeller = new HouseSeller(houseMediator);
        houseBuyer.send("hello?");
        houseSeller.send("bye!");
    }
}
