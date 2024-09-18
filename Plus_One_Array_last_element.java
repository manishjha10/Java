public class Main {
  public static void main(String[]  args )
  {
    ArrayList<Integer> l = new ArrayList<>() ;
    l.add(9);
    l.add(9) ;
    l.add(9) ;//  or any input  
    //  travel the loop  from last because we add the 1 in the last then propogate the carry .
    int num  =  1 ,  carry  =  0 ;
   for(int l.size()-1 ;i>= 0 ;i-- ) 
     {
     if(l.get(i) < 9 ) 
     {
       int ans  = l.get(i) + 1 ; 
       l.set(i,ans ) ;
       num  =  0;  //  if eleement is  less then 9  the only last element add carry not propoagte .
       break  ;
     }
     else if(l.get(i) >= 9) {
       int ans  =  l.get(i) + num  ;
       carry  =  ans % 10 ;
       l.set(i, carry) ;
       num =  ans  / 10; 
     }
   }
     if(num>0)
     {
       l.add(0,num) ;     //  add msb bit if last element id greater than 9 and so on  
       
     }
   }
}
    
