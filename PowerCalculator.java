import java.util.Scanner;
public class PowerCalculator {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        a = sc.nextInt();
        System.out.print("Enter its power: ");
        b = sc.nextInt();
        int result = 1;

        for (int i = 1; i<=b; i++){
            result *= a;
        }
        System.out.println(a + " to the power of " + b + " is " + result);
    }
}
