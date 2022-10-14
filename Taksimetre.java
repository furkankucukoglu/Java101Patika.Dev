import java.util.Scanner;

public class main {
    public static void main(String[] args){

        int mesafe;
        double mesafeUcreti=2.20, acilisUcreti=10, tutar;

        Scanner input = new Scanner(System.in);
        System.out.print("Gidilecek mesafeyi yazınız: ");
        mesafe = input.nextInt();

        tutar = acilisUcreti + (mesafe * mesafeUcreti);
        tutar = tutar<20 ? 20 : tutar;
        System.out.println(tutar);
    }
}
