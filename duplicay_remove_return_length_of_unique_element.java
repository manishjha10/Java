

public class Duplicate_Remove_Array {           
    static int removeDuplicay(int[]  arr) {
      
        int k = 0;
      
        for (int i = 1; i < arr.length; i++) {
          
            if (arr[i] != arr[i - 1]) {   
                arr[k++] = arr[i - 1];
            }
        }
      
        int n = arr.length - 1;
        arr[k++] = arr[n];         

        return k;      
    }

    }

