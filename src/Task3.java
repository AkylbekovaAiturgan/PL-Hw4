import java.util.Scanner;

public class Task3 {
    public static void printRow(int n) {
        for (int i=1; i<=n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void printInvertedPyramid(int n) {
        for (int i=n; i>=1; i-=2) {
            printRow(i);
        }
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        printInvertedPyramid(2*n-1);
    }
}