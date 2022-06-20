import java.util.Scanner;

public class main {
    public static void main(String[] args) {
       /* Kullanıcıdan aldığınız boy ve kilo değerlerine göre kullanıcının beden kitle indeksini bulun
       beden kitle indeksi : Kilo / Boy(m) * boy(m)

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu giriniz .. : ");
        double boy = scanner.nextDouble();
        System.out.println("Lütfen kilonunzu giriniz... : ");
        double kilo = scanner.nextDouble();
        double hesapla = kilo / (boy * boy);
        System.out.println("Beden Kitle indeksiniz....: " +hesapla);

    }
}
