import java.util.*;
public class Palindrome{
    public static boolean checkP(int number){
        int num = number;
        int reverse=0;
        while(num!=0){
            int remainder= num % 10;
            reverse=reverse*10 + remainder;
            num=num/10;
        }

        if(number==reverse){
            return true;
        }else{
        return false;
        }
    }
    public static void main(String args[]) {
        int y=121;

       if(checkP(y)){
        System.out.println(y + " is a Palindrome.");
       }else{
        System.out.println(y+" is not a Palindrome.");
       }    
    }
}