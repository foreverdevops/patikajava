 public class DaireAlaniCevresi {
   private static final double PI=3.14;
   
   //𝜋 sayısını = 3.14 alınız.
   //Formül : (𝜋 * (r*r) * 𝛼) / 360
  public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    double alan;
    int r=sc.nextInt();
    int aci=sc.nextInt();
    sc.close();
    
    alan= ( PI * (r * r) * aci ) / 360;
    System.out.println("sonuc: " + alan);
    

  }
 
 }
