import java.util.Scanner;

public class Task9 {
        public static boolean isArmstrong(int n) {
            int a=n/100;
            int b=n/10%10;
            int c=n%10;
            return a*a*a+b*b*b+c*c*c==n;
        }

        public static void main(String[] args) {
            for(int i=100;i<=999;i++) {
                if(isArmstrong(i)) {
                    System.out.print(i+" ");
                }
            }
        }
    }
