package minggu1;

public class No2c {
    
    public static void main(String[] args) {
        // Menghitung Volume tabung
        double diameter = 5;
        double tinggi = 10;
        double jarijari = diameter/2;
        double VolumeTabung = Math.PI * Math.pow(jarijari, 2) * tinggi;

        // Menampilkan hasil
        System.out.println("\n=====================================");
        System.out.println("Program Menghitung Volume Tabung");
        System.out.println("=====================================");
        System.out.println("Volume Tabung dengan diameter " + diameter + " dan " + "tinggi " + tinggi + " adalah " + VolumeTabung);
        System.out.println("");
    }
}
