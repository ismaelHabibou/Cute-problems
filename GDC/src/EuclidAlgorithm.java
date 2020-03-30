import java.util.Scanner;

public class EuclidAlgorithm {

    public static void main(String[] args) {
	// Create a scanner
        Scanner scanner = new Scanner(System.in);

/*        // Prompt the user to enter two strings
        System.out.println("Enter first integers: ");
        int m = scanner.nextInt();
        System.out.println("Enter second integer: ");
        int n = scanner.nextInt();

        System.out.println("The greatest common divisor for " + m + " and " + n + " is " + gdc(m,n));*/

        System.out.println(7 % 10);

    }

    /** Find GDC for integers m and n*/
    public static int gdc(int m, int n){
        if (m % n == 0)
            return n;
        else
            return gdc(n, m % n);
    }
}
