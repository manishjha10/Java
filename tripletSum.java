import java.util.* ; //  triplets Sum equal to target  

class Solution {
    // Should return true if there is a triplet with sum equal
    // to x in arr[], otherwise false
    public static boolean find3Numbers(int arr[], int n, int x) { 
        Arrays.sort(arr) ;
       for(int  i = 0 ; i < n ; i++) {   
           int st =  i + 1 , end = n - 1 ; 
           
           while(st  <  end) { //  Bomary search  .
           if(arr[i] +  arr[st] +  arr[end] ==  x) return true  ;
               
            else if (arr[i] +  arr[st] + arr[end] <  x) {
                st  ++ ;
            } else  {
                end -- ;
            }
           }
       }
       if(arr.length< 3) return false  ;
    return false ;
}

}
