package week8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis penghitungan:");
        System.out.println("1. Bangun Datar ");
        System.out.println("2. Bangun Ruang");
        System.out.println("Pilih No:");

        int calculationType = scanner.nextInt();

        if (calculationType == 1) {
            System.out.println("Pilih bentuk yang ingin dihitung luasnya:");
            System.out.println("1. Persegi ");
            System.out.println("2. Persegi Panjang ");
            System.out.println("3. Segitiga ");
            System.out.println("4. Lingkaran ");
            System.out.println("Pilih No:");

            int choice = scanner.nextInt();

            BangunDatar bangunDatar;
            double result;

            switch (choice) {
                case 1: // Persegi
                    System.out.print("Masukkan sisi persegi: ");
                    int sisi = scanner.nextInt();
                    bangunDatar = new BangunDatar(sisi);
                    result = bangunDatar.luas(sisi);
                    System.out.println("Luas persegi: " + result);
                    break;

                case 2: // Persegi Panjang
                    System.out.print("Masukkan panjang persegi panjang: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar persegi panjang: ");
                    int lebar = scanner.nextInt();
                    bangunDatar = new BangunDatar(panjang, lebar);
                    result = bangunDatar.luas(panjang, lebar);
                    System.out.println("Luas persegi panjang: " + result);
                    break;

                case 3: // Segitiga
                    System.out.print("Masukkan alas segitiga: ");
                    double alas = scanner.nextDouble();
                    System.out.print("Masukkan tinggi segitiga: ");
                    double tinggi = scanner.nextDouble();
                    bangunDatar = new BangunDatar(0); 
                    result = bangunDatar.luas(alas, tinggi);
                    System.out.println("Luas segitiga: " + result);
                    break;

                case 4: // Lingkaran
                    System.out.print("Masukkan radius lingkaran: ");
                    double radius = scanner.nextDouble();
                    bangunDatar = new BangunDatar(0);  
                    result = bangunDatar.luas(radius);
                    System.out.println("Luas lingkaran: " + result);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } else if (calculationType == 2) {
            System.out.println("Pilih bentuk yang ingin dihitung volumenya:");
            System.out.println("1. Kubus ");
            System.out.println("2. Balok ");
            System.out.println("3. Bola ");
            System.out.println("4. Kerucut ");
            System.out.println("Pilih No:");

            int choice = scanner.nextInt();

            BangunDatar bangunDatar;
            double result;

            switch (choice) {
                case 1: // Kubus
                    System.out.print("Masukkan sisi kubus: ");
                    int sisi = scanner.nextInt();
                    bangunDatar = new BangunDatar(sisi);
                    result = bangunDatar.volumeKubus(sisi);
                    System.out.println("Volume kubus: " + result);
                    break;

                case 2: // Balok
                    System.out.print("Masukkan panjang balok: ");
                    int panjang = scanner.nextInt();
                    System.out.print("Masukkan lebar balok: ");
                    int lebar = scanner.nextInt();
                    System.out.print("Masukkan tinggi balok: ");
                    int tinggi = scanner.nextInt();
                    bangunDatar = new BangunDatar(panjang, lebar, tinggi);
                    result = bangunDatar.volumeBalok(panjang, lebar, tinggi);
                    System.out.println("Volume balok: " + result);
                    break;

                case 3: // Bola
                    System.out.print("Masukkan radius bola: ");
                    double radius = scanner.nextDouble();
                    bangunDatar = new BangunDatar(0); 
                    result = bangunDatar.volumeBola(radius);
                    System.out.println("Volume bola: " + result);
                    break;

                case 4: // Kerucut
                    System.out.print("Masukkan radius kerucut: ");
                    radius = scanner.nextDouble();
                    System.out.print("Masukkan tinggi kerucut: ");
                    tinggi = scanner.nextInt();
                    bangunDatar = new BangunDatar(0); 
                    result = bangunDatar.volumeKerucut(radius, tinggi);
                    System.out.println("Volume kerucut: " + result);
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
                    break;
            }
        } else {
            System.out.println("Pilihan tidak valid!");
        }

        scanner.close();
    }
}
