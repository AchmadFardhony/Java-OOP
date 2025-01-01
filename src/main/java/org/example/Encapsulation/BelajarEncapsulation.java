package org.example.Encapsulation;

public class BelajarEncapsulation {}

class Person {
        // Step 1: Private variables
        private String name;
        private int age;

        // Step 2: Getter and Setter for name
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        // Step 3: Getter and Setter for age with validation
        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    // Additional method to display information
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