package org.example.Modifier;

public class BelajarAcsessModifier {

    //Modifier
    //Access modifiers mengontrol aksesibilitas dari kelas, metode, dan variabel.
    public class MyClass1 {
        public int a;  // Bisa diakses dari kelas manapun
    }

    public class MyClass2 {
        private int a;  // Hanya bisa diakses dalam MyClass
    }

    public class MyClass3 {
        protected int a;  // Bisa diakses di subclass dan dalam paket yang sama
    }

    class MyClass4 {
        int a;  // Hanya bisa diakses dalam paket yang sama
    }

    //NonModifier
    public class MyClass5 {
        static int count = 0;  // Milik kelas, bisa diakses tanpa objek

        public static void increment() {
            count++;
        }
    }

    // Final Class
    final class MyClass {
        // Kelas ini tidak bisa diwariskan
    }

    // Final Method
    public class MyClass6 {
        // Method ini Tidak dapat di Override oleh subclass
        public final void display() {
            System.out.println("Hello");
        }
    }

    // Final Variable
    public class MyClass7 {
        public final int x = 10;  //Variable ini Tidak bisa diubah setelah diinisialisasi
    }

    // Abstract Class
    public abstract class Animal {
        public abstract void sound();  // Metode abstrak tanpa implementasi
    }

    // Kelas yang meng-extend Animal dan mengimplementasikan sound()
    public class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Bark");
        }
    }
}
