public class Largest_SubarrayLength_0and_1 { 
    static int maxLen(int[]  arr ){ 
        //  Map to store the index with corresponding sum
        Map<Integer ,Integer> mp = new HashMap<>() ;


        //  at the zero position store the  -1  to create the sum zero -1 +1  =  0 ;
        for(int i = 0 ; i < arr.length ;i++) {
            if(arr[i] == 0){
                arr[i]  = -1 ;    // in array at zero store -1
            }
        }


        //  we need 0 and 1  largest sub array length
        mp.put(0,-1) ;  // first is always first with 0  and -1[for 0 change to -1] iteration  and also we need maximum sum so 0,-1

        int pSum = 0 ,  MaxSum = 0;
        for(int  i = 0 ; i < arr.length ;i++) {
            pSum += arr[i];
            if (!mp.containsKey(pSum)) {
                mp.put(pSum, i);
            } else {
                MaxSum = Math.max(MaxSum, i - mp.get(pSum));    // we need maximum sum of o and 1
            }
        }
        return MaxSum ;
    }
    public static void main(String[] args) {
        int[]  arr = {0,1,0,1,0,0,1,0,1} ;   // array only 0  and  1
        int ans  =  maxLen(arr) ;
        System.out.println(ans) ;
    }
}
