class Solution {
  public int maximun(int[]  nums ) {
    int sum  = 0 ;
    int b = Integer.MIN_VALUE ;
    //  Using 2 loop 
   // for(int  i = 0 ;i < nums.length  ;i++ ) {
   //   sum  = 0 ;
   //  for(int j = 0; j < arr.length ;j++ ) {
   //    sum +=  arr[j] ;
   //     if(sum  >  b ) {
   //       b = sum  ; }
   //  }
   // }  
   //  using Kadane 's Algo 
    for(int i = 0 ;i < nums.length  ; i++ ) {
      sum +=  arr[i] ;          // for we need a sum 
      if(b< sum){ 
        b = sum  ; }  //  for we need a maximum sum  
      if(sum < 0) {sum  = 0 ;}   //  for we need a maximum sum neglecting the minimum sum 
    }
     
  return b  ;}
}
