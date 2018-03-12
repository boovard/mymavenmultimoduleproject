package com.switchfully.api;

import com.google.common.collect.Lists;
import com.switchfully.domain.person.Person;

import java.util.ArrayList;

public class MyAPI {

    public static void main(String[] args) {

        Person personOne = new Person("Marc", 36);
        Person personTwo = new Person("Timmy", 8);

        ArrayList<Person> personList = Lists.newArrayList(personOne,personTwo);
        for (Person person: personList) {
            System.out.println(person);
        }
    }
}
