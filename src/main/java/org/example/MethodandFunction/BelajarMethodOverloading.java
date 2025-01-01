package org.example.MethodandFunction;

public class BelajarMethodOverloading {
    //Method Overloading
    public static int tambah ( int a, int b ){
        return a + b;
    }
    public static int tambah ( int a, int b, int c ){
        return a + b + c;
    }

    public static void main ( String [] args ){
        BelajarMethodOverloading obj = new BelajarMethodOverloading();
        System.out.println("Hasil : "+obj.tambah(3,3));
        System.out.println("Hasil : "+obj.tambah(4,4,4));
    }
}
