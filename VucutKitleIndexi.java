public class VucutKitleIndexi {

  public static void main(String[] args) {
    
    
    Scanner sc=new Scanner(System.in);
    int kilo;
    double boy,vucutKitleIndexi;
    System.out.print("boyunuzu girin: ");
    boy=sc.nextDouble();
    //boy=double(sc.nextInt());
    
   System.out.print("\n" + "kilonuzu girin " + "\n");
   kilo=sc.nextInt();
   sc.close();
   vucutKitleIndexi=kilo / (boy * boy);
   NumberFormat NumberFormat = NumberFormat.getInstance();
   NumberFormat.setMaximumFractionDigits(10);
   System.out.println("vucut kitle indexiniz: " + numberFormat.format(vucutKitleIndexi));

  }

}
