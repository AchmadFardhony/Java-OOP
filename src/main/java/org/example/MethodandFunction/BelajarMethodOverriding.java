package org.example.MethodandFunction;

class MethodOverriding { }
    class Animal {
        public void Kecepatan( int Speed) {
            System.out.println("Kecepatan Pada Hewan");
        }
    }

    class Dog extends Animal {
        @Override
        public void Kecepatan( int Speed) {
            System.out.println("Kecepatan Seekor anjing adalah : " +Speed+" km/h");
        }
    }

    class Cat extends Animal {
        @Override
        public void Kecepatan( int Speed) {
        System.out.println("Kecepatan Seekor Kucing adalah : " +Speed+" Km/h");
    }
}

    class Main {
        public static void main(String[] args) {
            Animal animal1  = new Dog();
            Animal animal2 = new Cat();

            animal1.Kecepatan(100);
            animal2.Kecepatan(200);

        }
    }
