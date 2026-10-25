import java.util.Scanner;

public class Task15 {
    public static boolean isPalindrome(int n) {
        int original=n;
        int r=0;

        while(n>0) {
            int d=n%10;
            r=r*10+d;
            n/=10;
        }

        return original==r;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();

        if(isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
