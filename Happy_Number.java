class Solution {
static int sqr(int n) {
      return n*n ;
  }
   //  if Number repeats means never comes 1  means not an happy number .
     static int isHappy(int n) { 
         //code here
         
         int sum  =   0 ; 
         Set<Integer> set = new HashSet<>() ;

         while( n != 1 ){
             
             sum =   0 ; 
             
             while(n != 0) {
                 int d =  n %10 ;
                 sum  +=  sqr(d) ;
                 n = n /10 ;
             }
             
             
             if(sum  == 1) return 1  ;
             
             if(set.contains(sum)) {    //  element repeat in set duplicate happy number not present 
                 return 0 ;
             }
             
             
             
             set.add(sum) ;
             n = sum  ;
         }
         
         
         return 1  ;
     } 
}
