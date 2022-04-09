import java.util.Scanner;

public class 알람시계 {
	public static void main(String[] args) {

                    Scanner scan = new Scanner(System.in);
                    int h = scan.nextInt();
                    int m = scan.nextInt();
                    scan.close();

                    if( m >= 45){
                              m-=45;
                    }else{
                              m = 60 - (45 - m);
                              if(h == 0){
                                        h = 23;
                              }else{
                                        h--;
                              }
                    }
                 
                    System.out.println(h + " " + m);
          }
}