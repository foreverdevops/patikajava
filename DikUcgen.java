public class DikUcgen {

  public static void main(String[] args) {
  
    Scanner sc=new Scanner(System.in);
    int alan;
    double u;
    int a,b,c;
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    sc.close();
    
    
     u=(double) ( ( a + b + c ) / 2);
    //cevre a + b + c
    alan = (int) Math.sqrt( (u * ( u - a) * ( u - b) * ( u - c)));
    System.out.println(alan);
    
    
    
    
  
  
  }

}
