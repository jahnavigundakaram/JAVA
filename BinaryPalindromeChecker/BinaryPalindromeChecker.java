import java.util.*;
public class BinaryPalindromeChecker{
    public static boolean isBinaryPalindrome(int x){
        int reversed = 0;
        int original = x;
        while (x>0){
            reversed <<=1;
            reversed |=(x&1);
            x>>=1;
        }
        return reversed == original;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = sc.nextInt();
        if (isBinaryPalindrome(x)){
            System.out.print(x+" has a binary palindrome represenation.");
        }else {
            System.out.print(x+" does not have binary palindrome representation.");
        }
            
    }

}
