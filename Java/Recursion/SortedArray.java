public class SortedArray {

    public static boolean sort(int arr[] , int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]> arr[i+1]){
            return false;
        }
        return sort(arr, i+1);
    }
    public static void main(String args[]){
        int arr[]={0,1,2,4,6,5};
        System.out.println("Is sorted ? -- > "+sort(arr, 0));
    }
}
