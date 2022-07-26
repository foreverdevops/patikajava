package patika;

import java.util.Scanner;

public class PassTheClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner();
        double average;
        int mat,turkce,fizik,kimya,muzik;
        mat=scanner.nextInt();
        turkce=scanner.nextInt();
        fizik=scanner.nextInt();
        kimya=scanner.nextInt();
        muzik=scanner.nextInt();
        scanner.close();

        average=(mat + fizik + turkce + kimya + muzik

                ) / 5;
        if (average<=55) {
            System.out.println("sinifta kaldin.ortalama: " + average);
        }
        else {
            System.out.println("sinifi gectinn.ortalama: " + average);
        }
    }
}
