import java.util.Scanner;

public class Task14 {
    public static int transformDigits(int n) {
        int r=0;
        int p=1;

        while(n>0) {
            int d=n%10;

            if(d%2==0) {
                d++;
            } else {
                d--;
            }

            r=d*p+r;
            p*=10;
            n/=10;
        }

        return r;
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(transformDigits(n));
    }
}
