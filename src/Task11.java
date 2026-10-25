import java.util.Scanner;

public class Task11 {
    public static int lcm(int a,int b) {
        int l;
        if(a>b) {
            l=a;
        } else {
            l=b;
        }

        while(l%a!=0||l%b!=0) {
            l++;
        }
        return l;
    }
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        System.out.println("LCM = "+lcm(a,b));
    }
}

