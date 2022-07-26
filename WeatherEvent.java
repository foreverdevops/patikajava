package patika;

import java.util.Scanner;

public class WeatherEvent {
    public static void main(String[] args) {
        Scanner scanner=new Scanner();
        int temp=scanner.nextInt();
        if(temp < 5 ) {
            System.out.println("kayak");
        }
        else if (temp == 5) {
            System.out.println("kayak ya da sinema");
        }
        else if(temp > 5 && temp < 15) {
            System.out.println("sinema");
        }
        else if (temp == 15) {
            System.out.println("kayak ya da piknik");
        }
        else if(temp > 15 && temp < 25) {
            System.out.println("piknik");
        }
        else if(temp == 25) {
            System.out.println("piknik ya da yuzme");
        }
        else {
            System.out.println("yuzme");
        }
    }
}
