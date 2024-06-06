package week8;

public class BangunDatar {
    private int panjang;
    private int lebar;
    private int tinggi;
    private int diameter;
    private int sisi;
    private static final double pi = 3.14;

    // Constructors 
    public BangunDatar(int sisi) {
        this.sisi = sisi;
    }

    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Constructor 
    public BangunDatar(int panjang, int lebar, int tinggi) {
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }

    // Methods penghitungan luas
    public int luas(int a) {
        return a * a;
    }

    public int luas(int a, int b) {
        return a * b;
    }

    public double luas(double a, double b) {
        return (a * b) / 2;
    }

    public double luas(double a) {
        return pi * a * a;
    }

    // Methods untuk menghitung volume
    public int volumeKubus(int sisi) {
        return sisi * sisi * sisi;
    }

    public int volumeBalok(int panjang, int lebar, int tinggi) {
        return panjang * lebar * tinggi;
    }

    public double volumeBola(double radius) {
        return (4.0 / 3.0) * pi * radius * radius * radius;
    }

    public double volumeKerucut(double radius, double tinggi) {
        return (1.0 / 3.0) * pi * radius * radius * tinggi;
    }

    // Getters
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public int getTinggi() {
        return tinggi;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getSisi() {
        return sisi;
    }
}
