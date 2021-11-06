import java.util.Scanner;

public class ManavKasa {
  
    public static void main(String[] args) {
      private double armutFiyat=2.14;
      private double elmaFiyat=3.67;
      private double domatesFiyat=1.11;
      private double muzFiyat=0.95;
      private double patlicanFiyat=5.0;
      
      ManavKasa.toplam(armutFiyat,elmaFiyat,domatesFiyat,muzFiyat,patlicanFiyat);
      
      

    }
  
  private static void toplam(double armutFiyat,double elmaFiyat,double domatesFiyat,double muzFiyat,double patlicanFiyat) {
    
    Scanner sc=new Scanner(System.in);
    
    private double armut=sc.nextDouble();
    private double elma=sc.nextDouble();
    private double domates=sc.nextDouble();
    private double muz=sc.nextDouble();
    private double patlican=sc.nextDouble();
    
    System.out.println("Toplam Fiyat " + (armut * armutFiyat + elma * elmaFiyat + domates * domatesFiyat + muz * muzFiyat + patlican * patlicanFiyat));

  
  }

}
