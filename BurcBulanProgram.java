import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String burc = "";
        System.out.print("Doğduğunuz gün: ");
        int gun = input.nextInt();
        System.out.print("Doğduğunuz ay: ");
        int ay = input.nextInt();

        if(ay == 1) {

            if(gun >=  1 && gun <= 31) {
                if(gun < 22) {
                    burc = "Oğlak";
                }else {
                    burc = "Kova";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }

        }else if(ay==2){
            if(gun >=  1 && gun <= 28) {
                if(gun < 20) {
                    burc = "Kova";
                }else {
                    burc = "Balık";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==3){
            if(gun >=  1 && gun <= 31) {
                if(gun < 21) {
                    burc = "Balık";
                }else {
                    burc = "Koç";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==4){
            if(gun >=  1 && gun <= 30) {
                if(gun < 21) {
                    burc = "Koç";
                }else {
                    burc = "Boğa";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==5){
            if(gun >=  1 && gun <= 31) {
                if(gun < 22) {
                    burc = "Boğa";
                }else {
                    burc = "İkizler";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==6){
            if(gun >=  1 && gun <= 30) {
                if(gun < 23) {
                    burc = "İkizler";
                }else {
                    burc = "Yengeç";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==7){
            if(gun >=  1 && gun <= 31) {
                if(gun < 23) {
                    burc = "Yengeç";
                }else {
                    burc = "Aslan";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==8){
            if(gun >=  1 && gun <= 31) {
                if(gun < 23) {
                    burc = "Aslan";
                }else {
                    burc = "Başak";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==9){
            if(gun >=  1 && gun <= 30) {
                if(gun < 23) {
                    burc = "Başak";
                }else {
                    burc = "Terazi";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==10){
            if(gun >=  1 && gun <= 31) {
                if(gun < 23) {
                    burc = "Terazi";
                }else {
                    burc = "Akrep";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==11){
            if(gun >=  1 && gun <= 30) {
                if(gun < 22) {
                    burc = "Akrep";
                }else {
                    burc = "Yay";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }else if(ay==12){
            if(gun >=  1 && gun <= 31) {
                if(gun < 22) {
                    burc = "Yay";
                }else {
                    burc = "Oğlak";
                }
            }else {
                System.out.println("Hatalı  giriş yaptınız.");
            }
        }
        System.out.println("Burcunuz: " + burc);
    }
}
