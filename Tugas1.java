import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTik = 0, jmltiket, i = 1;
        double totalHarga = 0, subTotal, diskon, hargaTiket;
        String tutup;
        hargaTiket = 50000;
        while (true) {
            System.out.println("Pelanggan ke- " + i);

            System.out.println("Berapa tiket yang ingin anda beli?");
            jmltiket = sc.nextInt();

            if (jmltiket < 0) {
                System.out.println("Nilai tidak valid, silahkan masukkan ulang");
                continue;
            }

            subTotal = jmltiket * hargaTiket;
            System.out.println("Harga " + subTotal);

            if (jmltiket > 4) {
                diskon = subTotal * 0.1;
                System.out.println("Selamat anda mendapat diskon sebesar " + diskon);
            } else if (jmltiket > 10) {
                diskon = subTotal * 0.15;
                System.out.println("Selamat anda mendapat diskon sebesar " + diskon);
            } else {
                diskon = 0;
            }

            subTotal -= diskon;
            System.out.println("Harganya adalah " + subTotal);

            totalHarga += subTotal;
            totalTik += jmltiket;
            
            System.out.println("Apakah anda ingin menutup bioskop? (y/n) ");
            tutup = sc.next();

            if (tutup.equalsIgnoreCase("y")) {
                System.out.println("total tiket " + totalTik);
                System.out.println("total harga " + totalHarga);
                break;
            }
            i++;
            
        }
        sc.close();
    }
}
