import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Değişkenleri oluşturduk.
        int mat,fizik,kimya,turkce,muzik,tarih;

        //Kullanıcıdan değişkenleri almaya başlıyoruz.
        System.out.print("Matematik notunuz giriniz: ");
        mat = input.nextInt();

        System.out.print("Kimya notunuz giriniz: ");
        kimya = input.nextInt();

        System.out.print("Fizik notunuz giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuz giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih notunuz giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik notunuz giriniz: ");
        muzik = input.nextInt();

        //Not ortalamasını hesaplıyoruz.
        int toplam = (mat+turkce+tarih+muzik+fizik+kimya);
        double sonuc = toplam / 6.0 ;
        System.out.println("Ortalamanız: " + (sonuc));

        //Not ortalamasını koşul ifadesiyle yazdırıyoruz.
        if(sonuc >= 60){
            System.out.println("Sınıfı geçtiniz.");
        }
        else{
            System.out.println("Sınıf tekrarı.");
        }




    }

}
