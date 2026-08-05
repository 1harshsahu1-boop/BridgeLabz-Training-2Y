import java.util.Scanner;
public class ArmstrongNumber {
    public static int count(int n) {
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    public static boolean isArmstrong(int n) {
        int original = n;
        int sum = 0;
        int d = count(n);
        while (n > 0) {
            int rem = n % 10;
            sum = sum + (int) Math.pow(rem, d);
            n = n / 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not Armstrong number");
        }
    }
}