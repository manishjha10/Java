public class Main{
    static boolean ispowerThree(int n) {
        double ans = (double)(Math.log(n) /Math.log(3));
      // ans  =  Math.round(ans) ;
      double r = (int)Math.round(ans) ;
       System.out.println(r) ;
       
     int ans1 =   (int)Math.pow(3,r) ;
        if(ans1 == n){
            return true  ;
        }
        return false  ;
        
    }
    public static void main(String[] args){
       int n = 2147483647;
        
        if(ispowerThree(n)){
            System.out.println(true) ;
        }else{
            System.out.println(false) ;
        } 
        
    }
}
