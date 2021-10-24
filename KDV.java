public class KDV {
  
    public static void main(String[] args) {
    
      Scanner sc=new Scanner(System.in);
      float kdvliFiyat,toplam,kdv;
      int kdvsizFiyat=sc.nextInt();
      sc.close();
      

      kdv=(kdvsizFiyat > 1000  && kdvsizFiyat > 0) ? 0.18f : 0.08f;
      kdvliFiyat= (float)kdvsizFiyat * kdv;
       toplam= kdvliFiyat + (float)kdvsizFiyat;
      
       System.out.println( "KDV'siz fiyat: " + kdvsizFiyat + "\n"
      + "KDV'li fiyat: " + toplam + "\n"
      + "KDV tutarı: "+ String.format("%.2f",kdv)
      );
           System.out.println("KDV tutarı: "  + String.format("%.2f",kdv * kdvsizFiyat));
      
    
    }


}
