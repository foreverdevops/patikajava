package patika;

import java.util.Scanner;

public class UserLogin  {
    private static String username="abc";
    private static String password="abc";
    public static void check(String name,String pass) {

        if(name.equals(username) && pass.equals(password)) {
            System.out.println("giris basarili");
        }
        else {

            if (!name.equals(username) && pass.equals(password)) {
                System.out.println("kullanici adi yanlis");
            }
            else if ( !pass.equals(password) && name.equals(username)){
                System.out.println("sifre yanlis");

            }
            else {
                System.out.println("kullanici adi ve sifre yanlis");
            }
        }

    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        String pass=scanner.nextLine();
        scanner.close();

        check(name,pass);

    }

}
