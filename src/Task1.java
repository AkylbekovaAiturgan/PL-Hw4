import java.util.Scanner;

public class Task1 {

    static void printStrip(int n, char s) {
        for (int i=0; i<n; i++) {
            System.out.print(s);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        printStrip(7, '#');
    }
}