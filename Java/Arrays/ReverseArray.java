public class ReverseArray{
    public static void reverse(int arr[]){
            int first=0, last=arr.length-1;
            while(first<last){
                int swap= arr[first];
                arr[first]=arr[last];
                arr[last]=swap;
                first++;
                last--;
            }
    }
    public static void main(String args[]){
        int arr[]={1,4,5,6,7};
        reverse(arr);
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}