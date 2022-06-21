import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        System.out.print("1. kenarı giriniz.. : ");
        a = scanner.nextInt();
        System.out.print("2.kenarı giriniz...: ");
        b = scanner.nextInt();
        double h = Math.sqrt((a * a) + (b * b));
        System.out.println("Hipotenus ...: "+ h);



    }
}
