import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        //değişkenlerimizi oluşturalım
        double a, b, c, u, cevre, alan;

        //kullanıcıdan verilerimizi alalım
        Scanner input = new Scanner(System.in);
        System.out.print("1.kenarı giriniz: ");
        a= input.nextDouble();
        System.out.print("2.kenarı giriniz: ");
        b= input.nextDouble();
        System.out.print("3.kenarı giriniz: ");
        c= input.nextDouble();

        //heron formülüyle hesaplama yapalım
        u = (a + b + c) / 2;
        cevre = (2*u);
        System.out.println("Üçgenin Çevresi : " + cevre + " cm ");
        alan = Math.sqrt(u*((u-a)*(u-b)*(u-c)));
        System.out.print("Üçgenin Alanı : " + alan + " cm2");
    }

}
