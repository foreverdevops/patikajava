public class Taksimetre {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int acilis=10-;
    float ucret,mesafe;
    System.out.println("km?");
    mesafe=sc.nextInt();
    sc.close();
    
    ucret= ( (float)acilis + mesafe * 2.2f);
    System.out.println(ucret > 20 ? ucret + "tl" : (int)20 + " tl");
    
  
  }

}
