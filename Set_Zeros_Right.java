public class Main { 
  static void swap(int[]  arr , int i, int j) { 
    int temp =  arr[i] ; 
    arr[i] =  arr[j] ; 
    arr[j]  =  temp ;
  } 
  static void move(int[]  arr ){ 
    int index  = 0 ;
    for(int  i = 0 ; i < arr.length  ;i++ )  {
      if(arr[i] != 0 ) {       
        swap(arr , index, i) ; //  Element which are not zero placed it first and rest are zero by default   .
        index ++ ;
      } 
    }
  }
    
  public static void main(String[]  args) {
    int[]  arr  = {3,4,0,0,5} ;
    moveZero(arr) ; 
    for(int i :  arr)  {
      System.out.print(i + " " ) ;
  }
}
}
