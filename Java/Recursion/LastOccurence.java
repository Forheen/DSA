public class LastOccurence {
    public static int find(int arr[], int n, int i){
        if(i == -1){
            return -1;
        }
        if(n==arr[i]){
            return i;
        }
        return find(arr, n, i-1);
    }
    public static void main(String args[]){
        int arr[]={1,4,62,3,4,2,2,8};
        System.out.println("Found at position "+(int)(find(arr, 1,arr.length-1)+1));
    }
}