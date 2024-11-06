
class HelloWorld { 
    static void reverse(int[]  arr) {
    //  reverse each matrix row b yrow
    int i =0 , j = arr.length - 1 ;
    while(i < j) {
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    
    }
    static void transpose(int[][] arr){
        for(int  i = 0  ;i < arr.length ; i++) {
            for(int j = i + 1 ;j < arr[0].length  ;j ++) {
                int temp = arr[i][j] ;
                arr[i][j] = arr[j][i] ;
                arr[j][i] =  temp ;
            }
        } 
    }
    static void rotate(int[][] mat) {  
       transpose(mat) ;
       
       for(int  i= 0 ;i < mat.length ;i++) {
          reverse(mat[i]) ;
       }
       }
    
    public static void main(String[] args) {
    int[][] mat = {{1,2,3},{4,5,6},{7,8,9}} ;
    rotate(mat) ;
    
    for(int i = 0  ;i < mat.length ;i++){
        for(int j = 0 ;j < mat.length ;j++){
            System.out.print(mat[i][j] + " ") ;
        }System.out.println();
    }
    }
}


