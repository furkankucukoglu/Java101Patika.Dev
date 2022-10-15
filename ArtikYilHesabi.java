import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);
        System.out.print("Yılı giriniz: ");
        year=input.nextInt();

        if(year%4==0&&year%400==0){
            System.out.print(year + " Artık yıldır.");
        }
        else{
            System.out.print(year + " Artık yıl değildir.");
        }

    }
}
