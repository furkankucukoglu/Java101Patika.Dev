import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input =  new Scanner(System.in);
    int n ;
	System.out.println("Basamak sayısını giriniz :");
	n=input.nextInt();

    for (int i =1; i<=n; i++){
        for (int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for(int k=1; k<=(2*i)-1; k++){
            System.out.print("*");
        }
        System.out.println(" ");
    }





    }
}
