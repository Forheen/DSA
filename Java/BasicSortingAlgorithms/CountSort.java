public class CountSort{
    public static void sort(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
            max=Math.max(max, arr[i]);
        }


        int fq[]=new int[max+1];
        for(int i=0; i<arr.length;i++){
            fq[arr[i]]++;
        }

        for(int i : fq){
            System.out.print(i+ " ");
        }
        
        int j=0;
        for(int i=0; i<fq.length;i++){
            while(fq[i]>0){
                arr[j]= i;
                j++;
                fq[i]--;
            }
        }


    }
    public static void main(String args[]){
        int arr[]={5,4,5,1,2,5,3,8,6,4,1,3,2};
        sort(arr);
        System.out.println();
        for(int i : arr){
            System.out.print(i+ " ");
        }
    }
}