import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double boy;
        double kilo;
        double vucutKitleEndeksi;


        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu santimetre cinsinden giriniz : ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu kilogram cinsinden giriniz : ");
        kilo = inp.nextDouble();

        boy = boy / 100;

        vucutKitleEndeksi = kilo / (boy * boy);

        System.out.println("Vücut kitle endeksiniz = " + vucutKitleEndeksi);

    }
}
