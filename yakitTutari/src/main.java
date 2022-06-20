import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /* bir aracın kilometrede ne kadar yaktığını ve kaç kilometre yaptığı bilgilerini alın ve sürücünün toplam ne kadr ödemesi
        gerektiğini hesaplayın
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kilometreye kaç kuruş yakmakta...: ");
        double kurus = scanner.nextDouble();
        System.out.print("Kaç kilometre yaptınız...: ");
        int yokKm = scanner.nextInt();
        double kactl = kurus * yokKm;
        System.out.println("Arabanız "+ kactl +" Turk Lirası yakacaktır.");


    }
}
