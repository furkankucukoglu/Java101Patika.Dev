import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number=input.nextInt();

        while (true){
            System.out.print("dizi: ");
            pozitif(negatif(number),number);
            if(number==0){
                break;
            }
            break;
        }
    }

    static int pozitif(int number,int y){

        if(number>y){
            return number;
        }else{
            System.out.print(number+" ");
            return (pozitif(number+5,y));
        }
    }
    static int negatif (int number){
        if(number<=0){
            return number;
        }else{
            System.out.print(number+" ");
            return negatif(number-5);
        }
    }


}
