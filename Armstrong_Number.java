import java.util.Scanner ;
public class Main{
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in) ;
       int n  = sc.nextInt() ;
       int  power = 0 ;
       int count  = 0 ;
       int Copy_N =  n  ;
       while(n != 0){
           count ++ ;
           n /= 10 ;
       }
       n =  Copy_N ;
       int copy_N2 = n ;
       while(n != 0 ){
            int last_digit  =  n % 10 ;
            power +=  (int)Math.pow(last_digit ,count) ; //  + 125 +  27
            n /= 10 ;   //  Number Lost  Need tot be Store it .
       }

       n = copy_N2 ;
       if(n == power){
           System.out.println("Armstrong Number ") ;
       }else {
           System.out.println("Not Armstong NUmber ") ;
       }
    Scanner.Close() ;
  }
}
