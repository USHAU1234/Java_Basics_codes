import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        int a,b,op;
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter the value for a: ");
        a = var1.nextInt();

        Scanner var2 = new Scanner(System.in);
        System.out.println("Enter the value for b: ");
        b = var2.nextInt();

        Scanner input = new Scanner(System.in);
        System.out.println("Select the operation->\n 1.Add\n 2.Sub\n 3.Mul\n 4.Div\n 5.Mod\n 6.Default");
        System.out.println("Enter the option: ");
        int Choice = input.nextInt();
         switch(Choice){

             case 1:
                 op = a+b;
                 System.out.println("The sum of " +a+ " + " +b+ " is: " +op);
                 break;
             case 2:
                 op = a-b;
                 System.out.println("The sub of " +a+ " - " +b+ " is: " +op);
                 break;
             case 3:
                 op = a * b;
                 System.out.println("The mul of " +a+ " * " +b+ " is: " +op);
                 break;
             case 4:
                 op = a/b;
                 System.out.println("The div of " +a+ " / " +b+ " is: " +op);
                 break;
             case 5:
                 op = a%b;
                 System.out.println("The div of " +a+ " % " +b+ " is: " +op);
             default:
                 System.out.println("Invalid option selected");
        }


        }
    }
