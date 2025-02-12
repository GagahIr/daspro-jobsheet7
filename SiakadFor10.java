import java.util.Scanner;
public class SiakadFor10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nilai, tertinggi = 0, terendah = 100;
        int lulus = 0, tidakLulus = 0;

        for(int i = 1; i <= 10; i++) {
            System.out.println("Masukkan nilai Mahasiswa ke-" + i + ": ");
            nilai = sc.nextDouble();
            if (nilai < 60) {
                tidakLulus++;
            } else {
                lulus++;
            }
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi : " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);
        System.out.println("Jumlah lulus : " + lulus);
        System.out.println("Jumlah tidak Lulus : " + tidakLulus);

        sc.close();
    }
}