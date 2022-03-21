package TP05;

public class DriverTP05 {
    public static void main(String[] args){
        Koordinat A = new Koordinat(15, 12);
        Koordinat3D B = new Koordinat3D(10, 28, 30);
        System.out.println(B.hitungJarak(A));
        Koordinat3D C = new Koordinat3D(11, 26, 32);
        System.out.println(B.hitungJarak(C));
        KoordinatWarna D = new KoordinatWarna(35, 60, "hitam");
        KoordinatWarna E = new KoordinatWarna(25, 50, "putih");
        System.out.println(B.hitungJarak(D));
        System.out.println(D.hitungJarak(E));
    }
}
