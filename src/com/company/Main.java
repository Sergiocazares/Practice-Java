package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("John", Person.Gender.MALE),
                new Person("Maria", Person.Gender.FEMALE),
                new Person("Aisha", Person.Gender.MALE),
                new Person("Alex", Person.Gender.MALE),
                new Person("Alice", Person.Gender.FEMALE)
        );

        List<Person> females = new ArrayList<>();

        //Imperative Apporach
        for (Person person : people){
            if (Person.Gender.FEMALE.equals(person.gender)){
                females.add(person);
            }
        }

        for (Person female : females){
            System.out.println(female);
        }

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        //Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes
        @Override
        public String toString(){
            return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
        }

        //An enum is a special "class" that represents a group of constants (unchangeable variables, like final variables)
        enum Gender {
            MALE, FEMALE
        }

    }

}
