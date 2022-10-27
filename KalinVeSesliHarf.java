import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("harf giriniz: ");
	String harf=input.next();
	switch (harf){
        case "A":
        case "a":
        case "E":
        case "e":
        case "I":
        case "ı":
        case "O":
        case "o":
        case "U":
        case "u":
            System.out.println("kalın sesli harfler");
            break;
        default:
            System.out.println("ince sesli harfler");
    }

    }
}
