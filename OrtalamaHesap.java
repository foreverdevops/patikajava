public class OrtalamaHesap {

  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    
     float ortalama=0;
     int matematik=sc.nextInt();
     int fizik=sc.nextInt();
     int tarih=sc.nextInt();
     int muzik=sc.nextInt();
     int turkce=sc.nextInt();
     int kimya=sc.nextInt();
     int biyoloji=sc.nextInt();
     sc.close();
     
     ortalama = (float)((matematik + fizik + tarih + muzik + turkce + kimya + biyoloji)/7);
     System.out.print( ortalama > 60 ? "Sinifi Gecti": "Sinifta Kaldi" );

  }

}
