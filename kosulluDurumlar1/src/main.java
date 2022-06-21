import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        /*
        if (koşul){
            Koşul sağlanınca (true) bu blok çalışır
        }
        else
        {
            Bu blogun ustundeki herhangi bir koşul sağlanmadığında bu blok çalışır.
        }
         */

        Scanner scanner = new Scanner(System.in);
       /* System.out.print("Yaşınızı Girininiz...: ");
        int yas = scanner.nextInt();
        if (yas <18){
            System.out.println("Bu mekana giremezsiniz");
        }*/
        System.out.print("Lütfen Sayı Giriniz..: ");
        int sayi = scanner.nextInt();
        if (sayi <0){
            System.out.println("Negatif");
        }
        else {
            System.out.println("Positif veya sıfır");
        }





    }
}
