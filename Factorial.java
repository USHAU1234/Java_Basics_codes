import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        int num,fact = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = input.nextInt();

        for (int i = 1; i <= num; i++) {
                fact *= i;

            }

        System.out.println(fact);
    }
}
