package org.example.Encapsulation;

public class BelajarEncapsulation {}

class Person {
        private String name;
        private int age;

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        // Create an object of Person class
        Person person = new Person();

        // Set values using setters
        person.setName("John");
        person.setAge(30);

        // Get values using getters
        System.out.println("Person's Name: " + person.getName());
        System.out.println("Person's Age: " + person.getAge());

        // Display person info
        person.displayInfo();

    }
}