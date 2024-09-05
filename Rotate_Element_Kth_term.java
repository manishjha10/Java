public class Main{
  static void swap(int[]  arr ,int i ,int j){
    int temp =  arr[i] ;
    arr[i =  arr[j] ;
    arr[j] =  temp ;
  } 
  
  static void reverse(int[] arr ,int i,int j) {
    while(i<j){
      swap(arr,i,j) ;
      i++;
      j-- ;
    }
  }
  
  static void printArray(int[]  arr){
    // We Print the Elements of the Array so we use the for each loop to print the element of array
    for(int i : arr){
      System.out.print(i+ " " ) ;
    }
  }
  
  static void rotate(int[]  arr ,int k) {
    int n =  arr.length ;
    k = k % n ;
    reverse(arr,0,n-k-1) ;
    reverse(arr,n-k,n-1);
    reverse(arr,0,n-1) ;
    printArray(arr) ;
  }

  public static void main(String[] args){
    int[]  arr  = {1,2,3,4,5} ;
    int k = 2 ;
    rotate(arr,k) ;
  }
}
