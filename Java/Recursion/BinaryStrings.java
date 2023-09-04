public class BinaryStrings {
  

    public static void check(int n, String str, int lastPlace){
            if(n==0){
                System.out.println(str);
                return;
            }

            check(n-1, str+"0", 0);

            if(lastPlace==0){
                check(n-1, str+"1", 1);

            }

    }
    public static void main(String args[]){

        check(3, (""), 0);
    } 
}
