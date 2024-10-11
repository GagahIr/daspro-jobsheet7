import java.util.Scanner;

public class KafeDoWhile10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kopi, teh, roti;
        String pelanggan;
        double hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga;

        do {
            System.out.println("Masukkan nama pelanggan (ketik 'batal' untuk keluar): ");
            pelanggan = sc.nextLine();
            if (pelanggan.equalsIgnoreCase("batal")) {
                System.out.println("Transaksi dibatalkan");
                break;
            }
            System.out.println("Masukkan jumlah kopi : ");
            kopi = sc.nextInt();
            System.out.println("Masukkan jumlah teh : ");
            teh = sc.nextInt();
            System.out.println("Masukkan jumlah roti : ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total yang harus dibayar adalah Rp. " + totalHarga);
            sc.nextLine();

        } while (true);

        sc.close();
    }
}
