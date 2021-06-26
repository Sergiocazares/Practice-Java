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

        //The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList whenever you want. The syntax is also slightly different:
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
//The String class represents character strings. All string literals in Java programs, such as "abc" , are implemented as instances of this class. Strings are constant; their values cannot be changed after they are created
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
