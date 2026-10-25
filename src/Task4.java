import java.util.Scanner;

public class Task4 {
    public static void printRow(int s,int m) {
        for(int j=1;j<=m;j++) {
            System.out.print(s+" ");
            s++;
        }
        System.out.println();
    }

    public static void printMatrix(int n,int m) {
        int num=1;
        for(int i=1;i<=n;i++) {
            printRow(num,m);
            num+=m;
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int m=in.nextInt();
        printMatrix(2, 3);
    }
}
