import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* //int orn: 2
        System.out.print("Lütfen Yaşınızı Girin...:");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız "+yas);*/

        //double orn: 2,3
      /*  System.out.println("Lütfen Sayı Giriniz: ");
        double sayi = scanner.nextDouble();
        System.out.println("girmiş olduğunuz sayi : "+sayi);*/
        /* //String orn: Mehmet
        System.out.println("Lütfen Adınızı Giriniz .. : ");
        String isim = scanner.nextLine() ;
        System.out.println("Adınız...: "+ isim); */

        //if ile gelen datayı kontrol etme
        /*
        if(scanner.hasNextInt()){
            int sayi = scanner.nextInt();
            System.out.println("Sayi.." + sayi);

        }
        else {
            System.out.println("Lütfen sayı giriniz");
        }
*/
        //dummy kullanımı
        /*
        int yas = scanner.nextInt();
        scanner.nextLine(); // Dummy
        String isim = scanner.nextLine();
        System.out.println("Yaş: "+ yas);
        System.out.println("İsim: "+ isim);*/
        int yas1 = scanner.nextInt();
        int yas2 = scanner.nextInt();
        int yas3 = scanner.nextInt();
        System.out.println("Yas1 : "+ yas1 + "Yas2 : " + yas2 + "yas3 : "+ yas3);




    }
}
