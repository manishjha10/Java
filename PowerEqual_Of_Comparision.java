public class Main {
  public static void main(String[]  args){ 
    
   String  s =  "xxyyxy" ; 
    int n  =  s.length()  ;
    int  i = 0 , xCount  = 0,yCount  = 0 ; 
    while(i < n ) {
      //  seprate calculate the x count untill y not come full string travel .
      while(i < n && s.charAt(i) == 'x' ){xCount ++ ; i++  ;}  
      
      while(i < n && s.charAt(i) == 'y' ){yCount ++ ; i++  ;}  //  same for y   
      
      if(xCount !=  yCount) { 
        
        System.out.println("NO") ;   
        return  ; //  After is power of x and y are not equal then stop  
      }
  }  

    
    if(xCount ==  yCount) { 
      
      System.out.println("Yes") ; 
    }
   }
} 

