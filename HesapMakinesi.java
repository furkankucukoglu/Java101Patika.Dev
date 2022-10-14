import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner((System.in));
	    int n1,n2,secim;
        System.out.print("1.sayıyı giriniz: ");
        n1 = input.nextInt();
        System.out.print("2.sayıyı giriniz: ");
        n2 = input.nextInt();
        System.out.println("Lütfen yapılacak işlemi seçiniz: \n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme ");
        secim = input.nextInt();
        switch (secim) {
            case 1:
                System.out.println("Toplama sonucu: " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu: " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma sonucu: " + (n1 * n2));
                break;
            case 4:
                if(n2!=0) {
                    System.out.println("Bölme sonucu: " + (n1 / n2));
                }
                else {
                    System.out.println("Bir sayı 0'a bölünemez. ");
                }
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyeniz.");
        }
    }
}
