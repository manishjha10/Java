public class Main{
  public static String reverseVowel(String s) { 
  //  to store the unique charceters 
  Set<character> vowel = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U')) ;
  char ch[]  = s.toCharArray(); 
  int left = 0 , right =  s.length()-1 ;

    while(left < right){
      while(left < right  && ! vowels.contains(ch[left]) left ++ ; //  left side of string no vowel is present.
      while(left < right  && ! vowels.contains(ch[right]) right --  ; //  right side of string no vowel is present.   

      //  vowel is present then swap it  .
      char temp = ch[left] ;
      ch[left] = ch[right] ;
      ch[right]  = temp ;
      left ++ ;
      right --;
    }
    return new String(ch) ; //  convert thr charcater Array to string.
}
} 
      
    
