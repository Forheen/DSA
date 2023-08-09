public class BinarySearch{
    public static int search(int arr[], int key)
    {
        int start =0, end= arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid] == key){
                return key;
            }else if( arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int arr[]={3,5,7,9,11,13};
        int key =8;
        System.out.println("Found "+search(arr, key));

    }
}