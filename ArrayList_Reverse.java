import java.util.ArrayList ;
public class Main{
  public static void main(String[]  args) {
    ArrayList<Integer> list  = new ArrayList<>() ;
    list.add(1) ;
    list.add(2) ;
    list.add(3);
    list.add(4) ;
     int i  = 0 , j = list.size() - 1 ;
    while( i< j) {
      Integer temp  =  Integer.valueOf(get(i) ;
      list.set(i , list.get(j)) ;
      list. set(j , temp);
      i++ ;
      j-- ;
    }
  }
}         //  Collections.reverse() ; in collection module 
