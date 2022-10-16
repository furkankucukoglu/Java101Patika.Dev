import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int x;
	int toplam=0;
	Scanner input = new Scanner(System.in);


    do{
        System.out.print("Bir Sayı Giriniz :");
        x = input.nextInt();
        if(x % 2 == 1){
            toplam+=x;
        }


    }while (x>0);
        System.out.println("Toplam :" + toplam);



    }

}
