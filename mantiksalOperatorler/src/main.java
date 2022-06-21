public class main {
    public static void main(String[] args) {
        /*
        Mantıksal Operatörler
        && --> and Operatörü
        Bütün sonuçlar kendi içinde true ise genel sonuç true, en az birisi bile false ise genel sonuç false olur.

        || --> or Operatörü
        Sonuçlardan en az birisi bile True ise genel sonuç true, hepsi false ise genel sonuç false olur.

        ! --- not Operatörü
         */

        System.out.println( 3 == 3);
        System.out.println( 2 < 3);
        System.out.println( 3 == 3 && 2<3);//True
        System.out.println(3==3 || 3 < 3); //True
        System.out.println(3==3 && 2==2 && 1==1); //True
        System.out.println(3 == 3 && 3 < 3); //False
        System.out.println(3 == 4 || 3 < 3); //false
        System.out.println(3 == 33 || 3 < 3 && 2 == 2); //False
        System.out.println(3 != 33 || 3 < 3); //True
        System.out.println( ! (3==3)); // False aslında true gelecekti ama ! operatörü onu falseye dönderdi
        System.out.println(!((3<4 && "Murat"=="Murat") || 3.4 > 2.1)); //False

        
    }
}
