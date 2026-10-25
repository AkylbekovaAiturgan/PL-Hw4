import java.util.Scanner;

public class Task8 {
    public static String decimalToBinary(int n) {
        String s = "";

        while(n > 0) {
            int r = n % 2;
            s = r + s;
            n = n / 2;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(decimalToBinary(n));
    }
}
