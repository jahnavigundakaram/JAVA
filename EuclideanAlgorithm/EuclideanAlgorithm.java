import java.util.Scanner;

public class EuclideanAlgorithm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of num1 : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the value of num2 : ");
        int num2 = sc.nextInt();
        
        int gcd = calculateGCD(num1, num2);
        
        System.out.println("The GCD of " +num1 + " and " + num2 + " is: " + gcd);
        sc.close();
    }
    public static int calculateGCD(int a, int b){
        while(b!=0){
           int temp = b;
           b = a%b;
           a = temp;
        }
        return a;

    }
}
