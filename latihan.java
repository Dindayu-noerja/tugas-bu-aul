import java.util.Scanner;

public class latihan {
    public static void main(String[] args){

        double diskon;
        int hargaBarang;
        int totalBarang;
        int totalHarga;

        Scanner scan_aja = new Scanner(System.in);

        System.out.println("selamat datang di menghitung diskon");

        System.out.println("input harga barang: ");
        hargaBarang = scan_aja.nextInt();

        System.out.println("input total barang: ");
        totalBarang = scan_aja.nextInt();

        totalHarga = hargaBarang * totalBarang;

        System.out.println("total harga adalah "+ totalHarga);

        System.out.println("input diskeon: ");
        diskon = scanAja.nextDouble();
        diskon = diskon / 10 * totalHarga;

        double harga_akhir = totalHarga * diskon;

        System.out.println("harga total barang akhir adalah"+ harga_akhir);
        


    }
}
