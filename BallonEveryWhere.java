//  gfg Ballon Every Where 
class Solution {
    public int maxInstance(String s) {
       
        for(int i = 0 ;i < s.length() ;i++) {
            Character ch  = s.charAt(i); 
            mp.put(ch,mp.getOrDefault(ch,0)+1) ;
           } 
           
            int v_b = mp.get('b') ;
            int v_a = mp.get('a') ;
            int v_n = mp.get('n') ;
            int v_l = mp.get('l')/2 ; //  in balloon l,o  has twice occurences then we count as a one if four occurence it consider to be a 4/2=>2[2-pair of l is present] 
            int v_o = mp.get('o')/2 ;
         //  ballong minimum is the occurence of all characters 

       return Math.min(v_b ,Math.min(v_a ,Math.min(v_n ,Math.min(v_l ,v_o) ))) ; 
    
    }
}
