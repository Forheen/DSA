public class InsertionSort{
    public static void sort(int arr[]){
            int n=arr.length;
       
            for(int i=1; i<n; i++){
                int curr_position=arr[i];
                int prev= i-1;
                while(prev >= 0 && curr_position < arr[prev]){
                    arr[prev+1]=arr[prev];
                    prev--;
                }
                arr[prev+1]=curr_position;
            }


    }
    public static void main(String args[]){
        int arr[]={5,4,1,3,2};
        sort(arr);
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}