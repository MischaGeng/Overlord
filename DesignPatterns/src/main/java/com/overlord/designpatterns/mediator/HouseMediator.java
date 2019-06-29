package com.overlord.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者角色
 */
public class HouseMediator extends Mediator {
    private List<Person> people = new ArrayList<>();

    @Override
    public void register(Person person) {
        people.add(person);
    }

    @Override
    public void contact(Person person, String msg) {
        for (Person person1 : people) {
            if (!person.equals(person1)) {
                person1.receive(msg);
            }
        }
    }
}
