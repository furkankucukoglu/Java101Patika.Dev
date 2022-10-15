import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	double mesafe,yas,type;
    double ucret ;

    System.out.print("Mesafeyi km cinsinden giriniz: ");
	mesafe=input.nextInt();

	System.out.print("Yaşınızı giriniz: ");
    yas=input.nextInt();

    System.out.print("Yolculuk tipini giriniz (1=Tek Yön 2=Gidiş-Dönüş) : ");
    type=input.nextInt();

    if(type==1){
        ucret=mesafe*0.1;
        System.out.println("Ödenecek tutar: " + ucret + "TL");
    }else if(type==2){
        ucret=mesafe*0.1*2;
        System.out.println("Ödenecek tutar: " + ucret + "TL");
    }else{
        System.out.println("Hatalı Veri Girdiniz !");
    }
    if(mesafe>0);
    else{
            System.out.println("Hatalı Mesafe Girdiniz !");
    }
        if(yas<12&&type==1){
            ucret=(mesafe*0.10)/2;
            System.out.println("İndirimli  Tutar: "+ucret+"TL");
        }else if(yas<12&&type==2) {
            ucret=(mesafe)*0.10;
            System.out.println("İndirimli Tutar: "+ucret+"Tl");
        }
        if(yas>12&&yas<24&&type==1){
            ucret=(mesafe)*0.10;
            ucret-=ucret*0.10;
            System.out.println("Ödenecek Tutar"+ucret+"Tl");
        }else if(yas>12&&yas<24&&type==2){
            ucret=(mesafe)*0.10*2;
            ucret-=ucret*0.10;
            System.out.println("Ödenecek Tutar: "+ucret+"TL");
        }
        if(yas>65&&type==1){
            ucret=(mesafe)*0.10;
            ucret-=ucret*0.30;
            System.out.println("Ödenecek Tutar: "+ucret+"Tl");
        }else if(yas>65&&type==2){
            ucret=(mesafe)*0.10*2;
            ucret-=ucret*0.30;
            System.out.println("Ödenecek Tutar: "+ucret+"Tl");

        }

    }
}