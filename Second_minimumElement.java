public class SecondMaxima{  
     static int secondMin(int[]  arr){
    int b =  Integer.MAX_VALUE ;
    int secMin =  Integer.MIN_VALUE ;
    for(int i = 0 ; i < arr.length ;i++) {
       if(arr[i] <  b){
        secMin =  b  ;        //  for the second Minima .
        b =  arr[i] ;
       }
       else if(arr[i] < secMin && arr[i] != b){
        secMin =  arr[i] ;
       }
    } 
    return secMin ;
   } 

public static void main(String[]  args) {
        int[]  arr  = {2,12,65,90,9,680,90} ; 
         System.out.println("Second Minimum Elemnt of these array is " + secondMin(arr));
}
}
