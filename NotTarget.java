public class NotTarget{
    public static void main(String[] args) {
        int [] arr = {2 ,3 ,5, 5 , 6 ,10 ,15};
        //System.out.println(findtarget(arr, 11));
        int ans = floorInArray(arr, 0, arr.length-1, 5);
        System.out.println(ans);
    }
    public static int findtarget(int [] arr, int target){
        int start = 0 , end = arr.length -1 ;
        if (target > arr[end]) return end;
        int ans = -1;
        while(start<end){
            int mid = start + (end - start) /2 ;
            if(arr[mid]>=target){
                end = mid-1;
            }else{
                ans = mid;
                start = mid+1;
            }
        }
        return ans;
    }
    public static int[] indices(int [] arr ,int target , int range){
        int start = 0 , end = range;
        while(start<end){
            int mid = start + (end - start) /2 ;
            if(start+end == target) return new int[]{start+1,end +1};
            if(arr[mid]+arr[mid-1]>target){
                end = mid;
            }
        }
        return arr;
    }
    static int floorInArray(int arr[], int low, int high, int x)
    {
        if (low > high)
            return -1;

        // If last element is smaller than x
        if (x >= arr[high])
            return high;

        // Find the middle point
        int mid = (low+high)/2;

        // If middle point is floor.
        // if (arr[mid] == x)
        //     return mid;

        // If x lies between mid-1 and mid
        if (mid > 0 && arr[mid-1] <= x && x <= arr[mid])
            return mid-1;

        // If x is smaller than mid, floor
        // must be in left half.
        if (x < arr[mid])
            return floorInArray(arr, low, mid - 1, x);

        // If mid-1 is not floor and x is
        // greater than arr[mid],
        return floorInArray(arr, mid + 1, high,x);
    }
} 
