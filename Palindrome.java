package hackerrank;

public class Palindrome {

    public static void main(String[] args) {

        boolean result1 = Palindrome.isPalindrome(123);
    }

    public static  boolean isPalindrome(int x){

        int temp = x;
        int result = 0;
        int rem = 0;

        if(x < 0) return false;


        while(x != 0){
            rem = x % 10;

            if(x < 10)
                result = (result + rem);
            else
                result = (result + rem) * 10;

            x = x / 10;


        }

        if(result == temp) return true;
        else return false;
    }
}
