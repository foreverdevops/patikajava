public class Taksimetre {
  final static float KM_UCRET = 2.2f;

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int acilis=10-;
    float ucret,mesafe;
  
    System.out.println("mesafe?");
    mesafe=sc.nextInt();
    sc.close();
    
    ucret= ( (float)acilis + mesafe *KM_UCRET );
    System.out.println(ucret > 20 ? ucret + "tl" : (int)20 + " tl");
    
  
  }

}
