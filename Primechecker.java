import java.util.Scanner;

public class Primechecker {
    public static void main(String[] args){
        int num;
        boolean flag = true;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        num = input.nextInt();

        for(int i=2; i<=(num+1)/2; i++){
            if(num%i == 0){
                flag = false;
                break;
            }
        }
        System.out.println(num+ (flag? " is Prime": " is Not Prime"));
    }
}
