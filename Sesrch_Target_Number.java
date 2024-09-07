import  java.util.Arrays ;
public class test {
    static int target(int[]  arr,int tar){

        int st = 0, end = arr.length - 1, left = -1; //  Left
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == tar) {
                left = mid;
                end = mid - 1;
            } else if (arr[mid] > tar) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }

        return left;

    }

    static int right(int[]  arr  ,int tar){
        int st = 0, end = arr.length - 1, k = -1;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            if (arr[mid] == tar) {
                 k = mid  ;
                st = mid + 1;

            } else if (arr[mid] > tar) {
                st = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return k;
    }
    static int[]  search(int[]  arr, int tar) {
        int ans = target(arr, tar);
        int ans1 = right(arr, tar); //  indexecs
        if (ans != -1 && ans1 != -1) {
            return new int[]{ans, ans1};
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 1,3,5};
        int tar = 1;
        int ans[] = search(arr, tar);
        if (ans[0] != -1 && ans[1] != -1) {
            System.out.println(ans[0] + " " + ans[1]);
        } else {
            System.out.println(-1);
        }
    }
}
