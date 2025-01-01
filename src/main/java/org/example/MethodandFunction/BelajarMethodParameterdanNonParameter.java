package org.example.MethodandFunction;

public class BelajarMethodParameterdanNonParameter {

    //Method Non Parameter
    public void TampilkanSalam1(){
        System.out.println("Hai Doni");
    }
    private void TampilkanSalam2(){
        System.out.println("Hai Farel");
    }
    protected void TampilkanSalam3(){
        System.out.println("Hai aji");
    }
    void TampilkanSalam4(){
        System.out.println("Hai Hanin");
    }

    //Method Parameter
    public void TampilkanNama( String nama ){
        System.out.println("Hai nama saya adalah : " +nama);
    }
    private void TampilkanUmur( Integer Umur ){
        System.out.println("Hai saya doni umur saya adalah : " +Umur);
    }
    protected void TampilkanTinggi( Double Tinggi ){
        System.out.println("Hai saya doni tinggi saya adalah : " +Tinggi);
    }
    void TampilkanalamatdanUmur( String alamat, Integer Berat ){
        System.out.println("Hai nama saya doni rumah saya adalah : " +alamat );
        System.out.println("Hai nama saya doni Berat saya adalah : " +Berat);
    }

    public static void main( String[] args ){
        BelajarMethodParameterdanNonParameter obj = new BelajarMethodParameterdanNonParameter();
        obj.TampilkanSalam1();
        obj.TampilkanSalam2();
        obj.TampilkanSalam3();
        obj.TampilkanSalam4();
        obj.TampilkanNama("Achmad fardhony");
        obj.TampilkanUmur(28);
        obj.TampilkanTinggi(170.00);
        obj.TampilkanalamatdanUmur("Kemang",109);

    }
}
