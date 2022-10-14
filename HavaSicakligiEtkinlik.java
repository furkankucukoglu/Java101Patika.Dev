import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Hava Sıcaklığını Giriniz: ");
	int hava = input.nextInt();

	if (hava<5){System.out.println(" Kayak yapabilirsiniz.");}
	else if ( hava>5 && hava<=15) {System.out.println(" Sinamaya gidebilirsin. ");}
	else if ( hava>=15 && hava<=25) { System.out.println( " Piknik gidebilirsin. ");}
	else if ( hava>=25) { System.out.println( " Yüzmeye gidebilirsiniz. ");}
    }
}

