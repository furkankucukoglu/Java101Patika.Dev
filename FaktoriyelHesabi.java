import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n;
	int toplam=1;
	System.out.print("Faktöriyel sayısını giriniz :");
	n = input.nextInt();

	for(int i=1; i<=n;i++){
	    toplam = toplam*i;
	}
		System.out.print("Girilen sayının faktöriyeli :" + toplam);
    }
}
