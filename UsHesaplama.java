import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n,k;
        System.out.print("Üs alınacak sayıyı giriniz :");
        n=input.nextInt();
        System.out.print("Üs olacak sayıyı giriniz :");
        k=input.nextInt();
        int total = 1;
        for(int i=1; i<=k; i++){
            total *= n;
        }
        System.out.println(total);


    }
}
