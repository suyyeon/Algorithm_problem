import java.util.Scanner;

public class 별찍기_1 {
          public static void main(String[] args) {
                    Scanner scan = new Scanner(System.in);
                    int num = scan.nextInt();
                    scan.close();

                    for(int i = 1; i <= num; i++){
                              for(int j = 0; j < i; j++){
                                        System.out.print("*");
                              }
                             System.out.println();
                    }
          }
}
                    
          

