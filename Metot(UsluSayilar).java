import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    usAlma();
        System.out.println("Metot kullanarak üs alma işlemi tamamlandı.");

    }
    public static void usAlma(){
        Scanner input=new Scanner(System.in);
        System.out.print("taban giriniz: ");
        int taban=input.nextInt();

        System.out.print("kuvvet giriniz: ");
        int kuvvet=input.nextInt();

        int carpim=1;
        for(int i=1; i<=kuvvet; i++){
            carpim*=taban;
        }
        System.out.println(carpim);

    }
}
