import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Scanner sınıfını tanımladık.
        Scanner input = new Scanner(System.in);

        //Değişkenleri oluşturduk.
        int  mat, fizik, kimya, turkce, muzik;
        int toplam=0;
        double sonuc;
        int dersSayisi=0;


        //Kullanıcıdan değişkenleri almaya başlıyoruz.
        System.out.print("Matematik notunuz giriniz: ");
        mat = input.nextInt();
        if(mat<0 || mat>100){
            mat=0;
        }
        else{
            dersSayisi++;
            toplam+=mat;
        }

        System.out.print("Kimya notunuz giriniz: ");
        kimya = input.nextInt();
        if(kimya<0 || kimya>100){
            kimya=0;
        }
        else{
            dersSayisi++;
            toplam+=kimya;
        }

        System.out.print("Fizik notunuz giriniz: ");
        fizik = input.nextInt();
        if(fizik<0 || fizik>100){
            fizik=0;
        }
        else{
            dersSayisi++;
            toplam+=fizik;
        }

        System.out.print("Türkçe notunuz giriniz: ");
        turkce = input.nextInt();
        if(turkce<0 || turkce>100){
            turkce=0;
        }
        else{
            dersSayisi++;
            toplam+=turkce;
        }

        System.out.print("Müzik notunuz giriniz: ");
        muzik = input.nextInt();
        if(muzik<0 || muzik>100){
            muzik=0;
        }
        else{
            dersSayisi++;
            toplam+=muzik;
        }


        //Not ortalamasını hesaplıyoruz.
        toplam = (mat + turkce + muzik + fizik + kimya);
        sonuc = toplam / dersSayisi;

        System.out.println("Ortalamanız: " + (sonuc));

        if (sonuc >= 55) {
            System.out.println("Sınıfı geçtiniz.");

        } else {
            System.out.println("Sınıf tekrarı.");

        }
    }
}