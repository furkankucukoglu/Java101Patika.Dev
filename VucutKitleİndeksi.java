import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    double kilo,boy,indeks ;

        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo=input.nextDouble();

        System.out.print("Lütfen boyunuzu giriniz: ");
        boy=input.nextDouble();

        indeks=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: " + (indeks));


    }
}
