import java.util.Scanner;

public class HonerALgorithm {

    public static void main(String[] args) {
    // Create a scanner object
        Scanner input = new Scanner(System.in);

	// Prompt the user to enter the order of the polynomial
        System.out.print("Enter the order: ");
        int order = input.nextInt();

    // Enter the value of x to compute f(x)
        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();

    // Create an array that will store the coefficient
        double[] coefficients = new double[order + 1];

    // count the number of coefficient entered by the user
       int count = 0;

       while (count < coefficients.length){
           System.out.print("Enter coefficient a" + count + ": " );
           coefficients[count] = input.nextDouble();

           count++; // increment count
       }

        System.out.println("f(" + x + ") = " + f(x, coefficients));
    }

    /** Implementing Honer Algorithm
     **/
    public static double f(double x, double[] coefficients){
        double sum = 0;

        for (int i = coefficients.length - 1; i >=  0; i--){

            if (i == 0)
                sum = sum + coefficients[i];
            else
                sum = (sum + coefficients[i]) * x;
        }

        return sum;
    }
}
