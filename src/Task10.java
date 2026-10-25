import java.util.Scanner;

public class Task10 {
    public static int gcd(int a,int b) {
        int g=1;
        for(int i=1;i<=a&&i<=b;i++) {
            if(a%i==0&&b%i==0) {
                g=i;
            }
        }
        return g;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("GCD = "+gcd(a,b));
    }
}
