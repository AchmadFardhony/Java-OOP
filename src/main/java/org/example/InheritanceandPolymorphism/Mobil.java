package org.example.InheritanceandPolymorphism;

class Mobil {
    public void Harga(int HargaMobil){
        System.out.println("Harga Mobil");
    }
}

class Toyota extends Mobil{
    public void Harga (int HargaMobil){
        System.out.println("Harga Mobil Toyota adalah : " +HargaMobil);
    }
}

class Honda extends Mobil{
    public void Harga (int HargaMobil){
        System.out.println("Harga Mobil Honda adalah : " +HargaMobil);
    }
}

class Mitshubishi extends Mobil{
    public void Harga (int HargaMobil){
        System.out.println("Harga Mobil Mitshubisi adalah : " +HargaMobil);
    }
}

class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Toyota();
        Mobil mobil2 = new Honda();
        Mobil mobil3 = new Mitshubishi();

        mobil1.Harga(1000000);
        mobil2.Harga(2000000);
        mobil3.Harga(3000000);
    }
}