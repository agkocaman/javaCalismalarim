import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1. Sayıyı giriniz");
        int sayi1 = scanner.nextInt();
        System.out.print("Lütfen 2. Sayıyı giriniz");
        int sayi2 = scanner.nextInt();
        System.out.println("Girmiş olduğunuz 1. sayı : "+sayi1);
        System.out.println("Girmiş olduğunuz 2. sayı : "+sayi2);

        int gecici = sayi1;
        sayi1 = sayi2;
        sayi2 = gecici;
        System.out.println("Değiştirilmiş  1. sayı : "+sayi1);
        System.out.println("Değiştirilmiş  2. sayı : "+sayi2);
    }
}
