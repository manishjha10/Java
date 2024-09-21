import java.util.Scanner ;
public class  Main {
  public static void main(String[]  args ){  
    Sscanner sc = new Scanner(System.in) ;
   int a  = sc.nextInt() ;
   int b  =  sc.nextInt() ; 
    int r  = a % b  ; 
    while(r != 0) {
      a  =  b  ;
      b  =  r  ;
      r  = a % b  ;
    } 
     System.out.println(b) ; 
  }
}
    
