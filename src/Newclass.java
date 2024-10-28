
import java.util.Scanner;

public class Newclass {

    public static void main(String[] args) {
        System.out.print("Enter Frist Number:");
        int num1 = new Scanner(System.in).nextInt();
        System.out.print(
                "Enter Second Number:");
        int num2 = new Scanner(System.in).nextInt();
        int sub = num1 - num2;
        System.out.println("Sub: " + sub);
    }
}
