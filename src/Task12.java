import java.util.Scanner;

public class Task12 {
    public static int reverseNumber(int n) {
        int r=0;
        while(n>0) {
            int d=n%10;
            r=r*10+d;
            n=n/10;
        }
        return r;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(reverseNumber(n));
    }
}
