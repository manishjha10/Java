class solution {
  public int trap(int[]  height) {
    int n = height  ;
    int left_Array[]  = new int[n] ;
    int right_Array[]=  new int[n];
    left_Array[0] =  height[0] ;
    for(int  i= 1 ;i < n ;i++ ){
      // We find the maximum to compareing of left and current element 
    left_Array[i] =  Math.max(left_Array[i-1] , height[i] ) ;
    } 
    right_Array[n-1] = height[n-1] ;
    for(int i = n-2; i>= 0 ;i-- ) {
      right_Array[i] = Math.max(right_Array[i+1] , height[i] ) ;
    } 
    int total = 0 ;
    for(int i= 0 ;i < n ;i++) {
      int water = Math.min(left_Array[i] , right_Array[i] ) ;    //  water  maximum at pillar
      total +=  water -  height[i] ; // water trap at each pillar  ;
    } 
  retrun total ;
  }
}
