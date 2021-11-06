import java.util.Scanner;

public class HesapMakinesiSwitchCase {
  
  public static void main(String[] args) {
  
    int a,b,islemTipi;
  
    Scanner sc=new Scanner(System.in);
    System.outprintln("birinci sayi");
    a=sc.nextInt();
    
    System.out.println("ikinci sayi");
    b=sc.nextInt();
    
    System.out.println("islem tipi\n"
                       +"1-> toplama\n2-> cikarma\n3-> carpma\n4-> bolme");
    
    islemTipi=sc.nextInt();
    
    HesapMakinesiSwitchCase.islem(a,b,islemTipi);
    
  }
  
  static void islem(int a,int b,int islem) throws Exception {
    
    switch(islem) {
    
      case 1:
        //toplama
        System.out.println(a + b);
        break;
      case 2:
        //cikarma
        System.out.println(a - b);
        break;
      
      case 3:
        //carpma
        System.out.println(a * b);
        break;
        
      case 4:
        //bolme
        System.out.println(b != 0 ? a / b : "sayi sifira bolunemez");
        break;
      
      default:
        System.out.println("yanlis secim");
        break;
    
    }
    
    
  }
  

}
