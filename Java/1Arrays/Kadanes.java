public class Kadanes{
    public static void kadanes(int arr[]){

        int ms=Integer.MIN_VALUE;
        int cs= 0;
        for(int i=0;i<arr.length;i++){
           cs=cs+arr[i] <0 ? 0: cs+arr[i];
           ms=Math.max(cs,ms);
        }
        System.out.println("\nmax sum :"+ms);

    }
    public static void main (String args[]){
        int arr[]={1,-2,6,-1,3};
        kadanes(arr);


    }
}