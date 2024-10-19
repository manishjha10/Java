 static int maxLen(int[]  arr) {
        Map<Integer,Integer> mp  =  new HashMap<>();

        mp.put(0,-1) ;  //  for maximum sum
        int pSum  = 0 , MaxSum  = 0 ;

        for(int i  = 0 ; i < arr.length  ;i++) {
            pSum +=  arr[i] ;
            if(!mp.containsKey(pSum)){
                mp.put(pSum,i) ;  //  sum with index put
            }
            else {  //  if exist sum
                MaxSum =  Math.max(MaxSum , i -mp.get(pSum)) ;

            }
        }
        return MaxSum ;
    }
