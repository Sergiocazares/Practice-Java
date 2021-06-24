package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Imperative Approach
        List<Person> people = List.of(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", MALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE)

        );
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString(){
            return "Person{" + "name='" + name + '\'' + ", gender=" + gender + '}';
        }

        enum Gender {
            MALE, FEMALE
        }

    }

}
