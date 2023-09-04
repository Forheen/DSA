public class BubbleSort{
    public static void sort(int arr[]){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i;j++){
                if(arr[i]<arr[i+1]){
                    int swap=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=swap;
                }
            }
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