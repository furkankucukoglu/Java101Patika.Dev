import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);
        System.out.print("Kullanıcı Adınız: ");
        userName=input.nextLine();
        System.out.print("Şifreniz: ");
        password=input.nextLine();
        if(userName.equals("furkan") && password.equals("1234")){
            System.out.println("Giriş Başarılı.");
        }else {
            System.out.println("Kullanıcı adı veya Şifre Yanlış! ");
        }
    }
}