public class SelectionSort{
    public static void sort(int arr[]){
            int n=arr.length;
        for(int i=0; i<n-1;i++){
                int minPosition=i;            
            for(int j=i+1;j<n;j++){
                minPosition= arr[minPosition]>arr[j] ? j: minPosition;

            }
            int swap= arr[minPosition];
            arr[minPosition]=arr[i];
            arr[i]=swap;
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