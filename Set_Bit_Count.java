class compute {
  static void setCountBit(Integer[] arr ,int n) {
    Arrays.sort(arr ,new MIN()) ;
  } 
  //  Compare with the Custom   Comparator  .
  
   static class MIN Comparator<Integer> 
     { 
       
     public int compare(Integer a , Integer b ) {
     int aa = Integer.bitCount(a) ; //  Count the bit of a  
     int bb =  Integer.bitCount(b) ; //  Count the bit of  b 

    if(aa> bb) {
      return  -1 ;
    } 
    else if(aa < bb) {
      return 1 ;
    }
     else  {
       return  0 ;
     } 
   }
  }
}
