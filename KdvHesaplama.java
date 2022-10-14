import java.util.Scanner;
public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double tutar, kdvOran, kdvTutar, kdvliTutar;
        System.out.print("Ücreti giriniz: ");
        tutar = input.nextDouble();
        if(tutar>=0 && tutar<=1000){
            kdvOran=0.18;
            kdvTutar=tutar*kdvOran;
            kdvliTutar=tutar+kdvTutar;
        }
        else {
            kdvOran=0.08;
            kdvTutar=tutar*kdvOran;
            kdvliTutar=tutar+kdvTutar;
        }
        System.out.println("ücret: " + (tutar));
        System.out.println("kdv tutarı: " + (kdvTutar));
        System.out.println("kdv'li tutar: " + (kdvliTutar));

    }
}
