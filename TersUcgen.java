import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int n;
        System.out.print("İstenilen basamak sayısı :");
        n=input.nextInt();
        for(int a=1; a<n; a++){
            for(int b=1; b<=a; b++){
                System.out.print(" ");
            }
            for(int c=1; c <= 2 * n - (2 * a + 1); c++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
