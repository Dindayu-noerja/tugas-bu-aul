
import java.util.Scanner;

public class kerja{
    public static void main(String[] args) {
        int jamKerja;
        int tarifPerJam;
        double pajak = 5.000;
        double bruto;
        double pembagi = 5;
        double hasilAkhir;
        double netto;
        Scanner scan = new Scanner(System.in);

        //BRUTO JAM KERJA * TARIF PER JAM
        //NETTO * BRUTO KALI 10 PERSEN

        System.out.println("berapa lama jam kerja: ");
        jamKerja = scan.nextInt();
        System.out.println("berapa tarif per jam: ");
        tarifPerJam = scan.nextInt();
        bruto = jamKerja * tarifPerJam;
        System.out.println("bruto adalah: "+bruto);
        pembagi = pembagi / 100;
        netto = bruto * pembagi;
        System.out.println("netto adalah: "+ netto);
        hasilAkhir = bruto - netto;
        System.out.println("hasil akhir adalah: "+hasilAkhir);

    }
    }


    

