import java.util.Scanner;
public class ChocolateWrapper{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Money: ");
        int money = sc.nextInt();
        int totalChocolates = Chocolates(money);
        System.out.println("Chocolates eaten: " + totalChocolates);
    }
    public static int Chocolates(int money) {
        int chocolatesEaten = money;
        int wrappers = money;
        while (wrappers >= 3) {
            int newChocolates = wrappers / 3;
            chocolatesEaten += newChocolates;
            wrappers = (wrappers % 3) + newChocolates;
        }
        return chocolatesEaten;
    }
}
