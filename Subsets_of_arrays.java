

public class equalSubstring {
    static boolean subset(int[] arr1 , int[] arr2) {
        //  we find the maximum in the both arrays
        //  Maximum in arr1

        int max1 =  0 ;
        for(int i :  arr1){

            max1 =  Math.max(max1 ,i) ;
        }

        //  maximum in arr2
        int max2 = 0 ;
        for(int i :  arr2) {
            max2 = Math.max(max2,i) ;
        }

        // compare both the maximumna
        int max  =  Math.max(max1,max2) ;

        int[] fre  =  new int[max+1] ;
        for(int i :  arr1){
            fre[i] ++ ;
        }
        //  Second array element is present in first array then sub tract it count
        for(int i : arr2){
            fre[i] -- ;
        }
        // occurence of element is negative then return false ;
        for(int i : fre) {
            if(i < 0) {
                return false ;
            }
        }
        return true  ;
    }
    public static void main(String[] args) {
        int[] arr1 =  {1,2,3,4,4,5,2,1,6} ;
        int[]  arr2 = {1,2,4} ;
        if(subset(arr1,arr2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
